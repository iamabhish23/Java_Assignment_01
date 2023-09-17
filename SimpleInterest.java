import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
