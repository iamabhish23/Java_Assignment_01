import java.util.Scanner;

public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isDivisible = (number % 5 == 0) && (number % 11 == 0);
        String result = (isDivisible) ? "Divisible by 5 and 11" : "Not divisible by 5 and 11";
        System.out.println(number + " is " + result);
    }
}
