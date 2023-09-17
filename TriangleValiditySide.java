import java.util.Scanner;

public class TriangleValiditySide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of the second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of the third side: ");
        int side3 = scanner.nextInt();

        boolean isValid = (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2) &&
                          (side1 > 0 && side2 > 0 && side3 > 0);
        String result = (isValid) ? "valid" : "invalid";
        System.out.println("Triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is " + result);
        scanner.close();
    }
}
