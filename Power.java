import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base (x): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent (y): ");
        int exponent = scanner.nextInt();
        
        double result = Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
        scanner.close();
    }
}
