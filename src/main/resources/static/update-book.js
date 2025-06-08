
function loadBook() {

    const bookId = document.getElementById("bookIdInput").value.trim();
    const formSection = document.getElementById("formSection");

    if (!bookId) {
        alert("Enter valid book id!");
    }

    fetch(`/api/v1/books/${bookId}`)
    .then(res=> {
        if (!res.ok) throw new alert("Book not found! Enter valid id!");
        return res.json();
        })
    .then(data=> {
        document.getElementById("title").value = data.title;
        document.getElementById("author").value = data.author_id;
        document.getElementById("category").value = data.category_id;
        document.getElementById("desc").value = data.description;
        document.getElementById("price").value = data.price;
        document.getElementById("stock").value = data.stock;
        formSection.style.display = 'block';
    });

}


function updateBook() {

    const bookId = document.getElementById("bookIdInput").value.trim();

    const updatedBook = {
        title: document.getElementById("title").value,
        author_id: document.getElementById("author").value,
        category_id: document.getElementById("category").value,
        description: document.getElementById("desc").value,
        price: document.getElementById("price").value,
        stock: document.getElementById("stock").value

    }

    fetch(`/api/v1/books/${bookId}`, {
        method: 'PUT',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(updatedBook)
    })
    .then(res=>res.json())
    .then(data=> {
        alert("Book updated successfully!");
    })
    .catch(error=>{
        alert("Something went wrong! - " + error.message);
    });

}

