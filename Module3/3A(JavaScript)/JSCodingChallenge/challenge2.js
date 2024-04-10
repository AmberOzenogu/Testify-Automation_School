// Create a length converter function.

function lengthConverter(meter){
    // Convert meters to centimeters (1 meter = 100 centimeters)
    const centimeter = meter * 100;
    return centimeter;
}

const length = 41;
const convertedLength = lengthConverter(length);

console.log(length + " meters is equivalent to " + convertedLength + " centimeters");
