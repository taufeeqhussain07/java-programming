import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        int reversedNumber = reverseNumber(inputNumber);
        int steps = 0;

        while (!isPalindrome(inputNumber)) {
            inputNumber += reversedNumber;
            reversedNumber = reverseNumber(inputNumber);
            steps++;
        }

        System.out.println("Palindrome number: " + inputNumber);
        System.out.println("Number of steps: " + steps);

        scanner.close();
    }

    // Function to reverse a number
    private static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    // Function to check if a number is a palindrome
    private static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
}
