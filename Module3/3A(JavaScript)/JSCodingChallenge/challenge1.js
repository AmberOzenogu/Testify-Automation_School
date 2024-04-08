// Calculate the sum of numbers within an array

const myArray = [2, 3, 4, 5, 6];

function sumArray(array) {
    let sum = 0;
    for (let number = 0; number < array.length; number = number + 1) {
        sum += array[number];
    }
    return sum;
}

const sum = sumArray(myArray);

// console.log(myArray);
console.log("Sum of numbers: " + sum);
