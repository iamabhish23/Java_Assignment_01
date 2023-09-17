import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
        scanner.close();
    }
}
