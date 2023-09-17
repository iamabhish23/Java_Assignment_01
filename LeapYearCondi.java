import java.util.Scanner;

public class LeapYearCondi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        String result = (isLeapYear) ? "Leap year" : "Not a leap year";
        System.out.println(year + " is " + result);
        scanner.close();
    }
}
