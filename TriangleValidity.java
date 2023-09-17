import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle of the triangle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle of the triangle: ");
        int angle3 = scanner.nextInt();

        boolean isValid = (angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0);
        String result = (isValid) ? "valid" : "invalid";
        System.out.println("Triangle with angles " + angle1 + ", " + angle2 + ", " + angle3 + " is " + result);
        scanner.close();
    }
}
