import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        int totalNotes = 0;

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            amount %= notes[i];
            totalNotes+=count;
            if(count!=0){
                System.out.println("Number of " + notes[i] + " rupee notes: " + count);
            }
            
        }

        System.out.println("Total Number of Notes are: " + totalNotes);

        scanner.close();
    }
}
