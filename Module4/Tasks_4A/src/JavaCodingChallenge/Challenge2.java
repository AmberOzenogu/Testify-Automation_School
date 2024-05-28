package JavaCodingChallenge;

public class Challenge2 {
    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    // Method to reverse the words in a sentence using recursion
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Call the recursive function to reverse the array of words
        reverseArray(words, 0, words.length - 1);
        // Join the reversed array of words back into a string
        return String.join(" ", words);
    }

    // Recursive method to reverse an array of words
    private static void reverseArray(String[] words, int start, int end) {
        if (start >= end) {
            return; // Base case: If start index is greater than or equal to end index, stop recursion
        }
        // Swap the words at start and end indices
        String temp = words[start];
        words[start] = words[end];
        words[end] = temp;
        // Recursively call the function with the next indices
        reverseArray(words, start + 1, end - 1);
    }
}
