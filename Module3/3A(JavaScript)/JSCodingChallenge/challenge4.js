// Print a table containing multiplication tables.

const table = 10;

// loop through rows
for (let a = 1; a <= table; a++) {
    let row = ''; // empty string for each row

    // loop through columns
    for (let b = 1; b <= table; b++) {
        // multiply the row by the column to get the value
        let value = a * b;

        // add the value to the row string with appropriate padding
        row += value.toString().padStart(4);
    }
    console.log(row);
}
