import java.util.Scanner;

public class SumOfPrimesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers between 1 and " + n + ": " + sum);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
