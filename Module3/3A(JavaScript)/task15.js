// My personal library 3: Arrays

const books = [
    {
        title: "The Witness",
        description: "A romantic suspense novel.",
        numberOfPages: 496,
        author: "Nora Roberts",
        reading: true
    },
    {
        title: "The Long Road Home",
        description: "A family drama novel.",
        numberOfPages: 448,
        author: "Danielle Steel",
        reading: false
    },
    {
        title: "A Time to Kill",
        description: "A legal thriller novel.",
        numberOfPages: 515,
        author: "John Grisham",
        reading: true
    }
]

for (let book = 0; book < books.length; book = book + 1) {
    if (books[book].reading) {
        console.log("Title: " + books[book].title);
        console.log("Description: " + books[book].description);
        console.log("Number of Pages: " + books[book].numberOfPages);
        console.log("Author: " + books[book].author);
        console.log("Reading: " + books[book].reading);
        console.log("---------------------------------------");
    }
}
