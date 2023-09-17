import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
