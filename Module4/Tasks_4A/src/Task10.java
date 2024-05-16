import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Task10 methodVar = new Task10();
        methodVar.visitors();

    }

    public void visitors(){
        Scanner verify = new Scanner(System.in);
        System.out.println("Input passkey for access to Testify Trainings");
        String userInput = verify.nextLine();

        while (true) {
            if (!userInput.equalsIgnoreCase("Testify")) {
                System.out.println("You have been rejected, try again.");
                userInput = verify.nextLine();
            } else if (userInput.equalsIgnoreCase("Testify")) {
                System.out.println("Welcome to Testify trainings!");
                break; // Exit the loop
            }
        }
    }
}
