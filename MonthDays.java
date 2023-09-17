import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        int daysInMonth;

        switch (monthNumber) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2:  // February
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                break;
            default:
                daysInMonth = -1;
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        if (daysInMonth != -1) {
            System.out.println("Number of days in the month: " + daysInMonth);
        }
    }
}
