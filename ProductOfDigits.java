import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;
        int digit;

        while (number > 0) {
            digit = number % 10;
            product *= digit;
            number /= 10;
        }

        System.out.println("Product of digits: " + product);
        scanner.close();
    }
}
