package JavaCodingChallenge;

import java.util.Arrays;
import java.util.Random;
public class Challenge8 {
    public static void main(String[] args) {
        // Generate a collection of 1 million integers ranging from 1 to 9
        int[] array = new int[1000000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9) + 1;
        }

        // Sort the array using counting sort
        int[] sortedArray = sortCount(array, 9);

        // Print the first 100 sorted elements to verify the output
        System.out.println("First 100 sorted elements: " + Arrays.toString(Arrays.copyOfRange(sortedArray, 0, 100)));
    }

    public static int[] sortCount(int[] array, int maxRange) {
        int[] count = new int[maxRange + 1];

        // Step 1: Count the occurrences of each integer
        for (int num : array) {
            count[num]++;
        }

        // Step 2: Write the sorted numbers back into the array
        int index = 0;
        for (int i = 1; i <= maxRange; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }

        return array;
    }
}
