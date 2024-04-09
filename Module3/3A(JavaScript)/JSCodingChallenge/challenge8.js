// Return a Boolean if a number is divisible by 10.

function returnBoolean(number) {
    if (number % 10 === 0) {
        return true;
    } else {
        return false;
    }
}

const number = 60;

console.log(returnBoolean(number));
