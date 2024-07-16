def count_vowels(string):
    string = string.lower()  # Convert the string to lowercase to handle case insensitivity
    vowels = "aeiou"  # Define a string containing all vowels

    count = 0
    for char in string:
        if char in vowels:
            count += 1

    return count

string = "How many vowels are in this question?"
print("Number of vowels:", count_vowels(string))
