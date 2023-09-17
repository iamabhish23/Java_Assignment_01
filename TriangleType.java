import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of the second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of the third side: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Triangle is isosceles.");
        } else {
            System.out.println("Triangle is scalene.");
        }
    }
}
