import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = binaryToDecimal(binaryStr);

        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int n = binary.length();

        for (int i = 0; i < n; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n - 1 - i);
            }
        }

        return decimal;
    }
}
