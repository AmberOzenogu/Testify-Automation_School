import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner verify = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Input your age");
                userInput = verify.nextInt();
                validInput = true;
            } catch (Exception myException) {
                System.out.println("Wrong data type, please input your age as a number.");
                System.out.println(myException);
                verify.next();
            }
        }

        System.out.println("No exception thrown");
    }
}