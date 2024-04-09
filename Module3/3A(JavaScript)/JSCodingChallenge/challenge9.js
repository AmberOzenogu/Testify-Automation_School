// Return the number of vowels in a string.

const string = "How many vowels are in this question?";

function countVowels(string) {
    
    string = string.toLowerCase();

    let count = 0;
    for (let char of string) {
        if (char === 'a' || char === 'e' || char === 'i' || char === 'o' || char === 'u') {
            count++;
        }
    }

    return count;
}

console.log("Number of vowels: "+ countVowels(string));
