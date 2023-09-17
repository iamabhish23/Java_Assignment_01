import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        int notes500 = amount / 500;
        int remainingAmount500 = amount % 500;

        int notes200 = remainingAmount500 / 200;
        int remainingAmount200 = remainingAmount500 % 200;

        int notes100 = remainingAmount200 / 100;
        int remainingAmount100 = remainingAmount200 % 100;

        int notes50 = remainingAmount100 / 50;
        int remainingAmount50 = remainingAmount100 % 50;

        int notes20 = remainingAmount50 / 20;
        int remainingAmount20 = remainingAmount50 % 20;

        int notes10 = remainingAmount20 / 10;
        int remainingAmount10 = remainingAmount20 % 10;

        int notes5 = remainingAmount10 / 5;
        int remainingAmount5 = remainingAmount10 % 5;

        int notes2 = remainingAmount5 / 2;
        int notes1 = remainingAmount5 % 2;

        System.out.println("Number of 500 rupee notes: " + notes500);
        System.out.println("Number of 200 rupee notes: " + notes200);
        System.out.println("Number of 100 rupee notes: " + notes100);
        System.out.println("Number of 50 rupee notes: " + notes50);
        System.out.println("Number of 20 rupee notes: " + notes20);
        System.out.println("Number of 10 rupee notes: " + notes10);
        System.out.println("Number of 5 rupee coins: " + notes5);
        System.out.println("Number of 2 rupee coins: " + notes2);
        System.out.println("Number of 1 rupee coins: " + notes1);
        scanner.close();
    }
}
