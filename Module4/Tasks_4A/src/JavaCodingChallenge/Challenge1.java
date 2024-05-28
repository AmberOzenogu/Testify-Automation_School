package JavaCodingChallenge;

public class Challenge1 {
    public static void main(String[] args) {
        // Check  if  racecar  and  10801  are palindromes
        String text = "racecar";
        String digit = "10801";

        // Check for racecar
        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }

        // Check for 10801
        if (isPalindrome(digit)) {
            System.out.println(digit + " is a palindrome");
        } else {
            System.out.println(digit + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
