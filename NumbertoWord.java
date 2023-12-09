import java.util.Scanner;

public class DigitToTextConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }
        
        String numberText = convertNumberToText(number);
        System.out.println("Number in text form: " + numberText);
        
        scanner.close();
    }
    
    public static String convertNumberToText(long number) {
        String[] digitText = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();
        
        while (number > 0) {
            long digit = number % 10;
            result.insert(0, digitText[(int) digit] + " ");
            number /= 10;
        }
        
        return result.toString().trim();
    }
}
