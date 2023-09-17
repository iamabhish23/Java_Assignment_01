import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        boolean isAlphabet = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
        String result = (isAlphabet) ? "Alphabet" : "Not an alphabet";
        System.out.println(ch + " is " + result);
        
        scanner.close();
    }
}
