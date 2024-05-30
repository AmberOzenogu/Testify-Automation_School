package JavaCodingChallenge;

public class Challenge7 {
    public static void main(String[] args) {
        String originalString = "TestifyAutomation";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
       // Base case: if the string is empty or has only one character, return the string
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the substring starting from the second character and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
