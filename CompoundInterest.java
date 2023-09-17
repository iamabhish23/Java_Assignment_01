import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();

        double compoundInterest = principal * Math.pow(1 + (rate / 100), time) - principal;
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
