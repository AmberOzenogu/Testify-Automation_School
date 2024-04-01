// My personal library 2: Methods

const books = {
    title:'Little Red Riding Hood',
    description:'little Red against the sly wolf.',
    numberOfPages: 25,
    author:'Charles Perrault',
    reading: true,
    toggleReadingStatus: function(){
        if(books.reading === true){
            books.reading = false
        } else {
            books.reading = true
        }
    }
}

books.toggleReadingStatus()

console.log(books.reading)
