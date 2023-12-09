import java.util.Scanner;
public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal = " + octalNumber);
    }}
