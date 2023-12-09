import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the income: ");
        int income = scanner.nextInt();
        double tax = 0;
        if (income <= 150000) {
            tax = 0;
        } else if (income>150000 && income < 300000) {
            tax = income* 0.1;
        } else if (income>300000 && income < 500000) {
            tax = income * 0.2;
        } else {
            tax = income* 0.3;
        }
        System.out.println("Tax= " + tax);
    }
}
