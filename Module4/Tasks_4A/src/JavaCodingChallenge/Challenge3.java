package JavaCodingChallenge;

public class Challenge3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, -3, -2, 8};
        findMaxProduct(array);
    }

    public static void findMaxProduct(int[] array) {
        // Initialize maximum product as the product of the first two elements
        int maxProduct = array[0] * array[1];
        int maxI = 0;
        int maxJ = 1;

        // Iterate through all pairs of elements in the array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int product = array[i] * array[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Maximum product = " + maxProduct + " by multiplying " + array[maxI] + " and " + array[maxJ]);
    }
}
