// Create a function that reverses an array.

const myArray = [1, 3, 5, 7, 9];

// Function to reverse an array
function reverseMyArray(array) {

    let reversedArray = [];
    
    for (let a = array.length - 1; a >= 0; a--) {
        reversedArray.push(array[a]);
    }
    
    return reversedArray;
}

const reversedArray = reverseMyArray(myArray);

console.log("My Array:", myArray);
console.log("My Reversed Array:", reversedArray);
