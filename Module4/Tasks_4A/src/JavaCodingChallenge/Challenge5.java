package JavaCodingChallenge;
import java.util.*;

public class Challenge5 {
    public static void main(String[] args) {
        String[] words = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = createAnagramBuckets(words);

        // Print the anagram buckets
        for (List<String> bucket : anagramBuckets.values()) {
            System.out.println(bucket);
        }
    }

    public static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> buckets = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            buckets.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        return buckets;
    }
}
