package JavaCodingChallenge;

import java.util.*;

public class Challenge6 {
    public static void main(String[] args) {
        String sentence = "Despite commuting at the peek hour, she was able to keep to time";
        findAnagrams(sentence);
    }

    public static void findAnagrams(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\W+");
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : words) {
            String sortedWord = sortCharacters(word.toLowerCase());
            anagramsMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Print the anagrams
        anagramsMap.values().stream()
                .filter(list -> list.size() > 1)
                .forEach(list -> System.out.println("Anagrams: " + list));
    }

    private static String sortCharacters(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
