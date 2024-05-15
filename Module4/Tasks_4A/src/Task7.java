import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String [] [] fruits = new String [4] [3];
        fruits [0] [0] = "Apple";
        fruits [1] [0] = "Orange";
        fruits [2] [0] = "Cranberry";
        fruits [3] [0] = "Grapes";

        System.out.println(Arrays.deepToString(fruits));
    }
}
