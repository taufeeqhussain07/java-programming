import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        if (binaryNumber.matches("[01]+")) {
            System.out.println("Hexadecimal equivalent: " + Integer.toHexString(Integer.parseInt(binaryNumber, 2)).toUpperCase());
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        }
    }
}
