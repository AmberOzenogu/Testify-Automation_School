import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //simple interest = p(1+rt) OR (P*R*T)/100
        System.out.println("Input your Principal Balance");
        double prinBal = userInput.nextDouble();
        System.out.println("Input the annual Interest Rate");
        double rate = userInput.nextDouble();
        System.out.println("Input the Time (in years)");
        int time = userInput.nextInt();

        double simInterest = prinBal * rate * time;
        double simpleInterest = simInterest / 100;

        System.out.println("Your simple interest calculated is " + simpleInterest);
    }
}
