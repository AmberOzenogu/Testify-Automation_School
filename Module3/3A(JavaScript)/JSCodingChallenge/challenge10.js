// Create a function that filters out negative numbers

const numbers = [5, -9, 1, -2, 8, 0, -10, 3, 18, 7, -6];

function negativeNumbers(array) {
    // empty array to store positive numbers
    let positiveNumbers = [];

    for (let a = 0; a < array.length; a++) {
        if (array[a] >= 0) {
            // add to the positiveNumbers array if positive
            positiveNumbers.push(array[a]);
        }
    }
    return positiveNumbers;
}

const positiveNumbers = negativeNumbers(numbers);
console.log(positiveNumbers);
