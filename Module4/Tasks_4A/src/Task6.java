public class Task6 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        StringBuilder reversed = new StringBuilder(word).reverse();

        System.out.println(reversed);
        System.out.println(reversed.substring(4,8));
    }
}
