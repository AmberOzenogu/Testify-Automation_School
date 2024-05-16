import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("Testify")) {
            System.out.println("Try again");
            userInput = text.nextLine();
        }
//        do {
//            System.out.println("Try again");
//            userInput = text.nextLine();
//        } while (!userInput.equalsIgnoreCase("Testify"));
    }
}
