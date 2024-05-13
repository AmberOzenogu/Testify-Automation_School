public class Task3 {
    public static void main(String[] args) {
        String text = "Age : ";
        int myAge = 23;

        //Method 1
        System.out.println(text + myAge);

        //Method 2
        System.out.println(text.concat(myAge + ""));
    }
}
