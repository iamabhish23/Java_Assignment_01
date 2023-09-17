import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexStr = scanner.nextLine();

        int decimal = hexadecimalToDecimal(hexStr);

        System.out.println("Decimal equivalent: " + decimal);
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        String digits = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        int decimal = 0;

        for (int i = 0; i < hexadecimal.length(); i++) {
            char c = hexadecimal.charAt(i);
            int digit = digits.indexOf(c);
            decimal = 16 * decimal + digit;
        }

        return decimal;
    }
}
