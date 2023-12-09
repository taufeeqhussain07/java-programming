import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String b = sc.next();
        sc.close();
        if (b.matches("[01]+")) {
            int d = 0, l = b.length();
            for (int i = 0; i < l; i++) {
                if (b.charAt(i) == '1') d += Math.pow(2, l - 1 - i);
            }
            System.out.println("Decimal Number: " + d);
            System.out.println("Octal: " + Integer.toOctalString(d));
        } else {
            System.out.println("Invalid input. Please enter a binary number.");
        }
    }
}
