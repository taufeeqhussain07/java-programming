import java.util.Scanner;
public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0, compositeCount = 0;
        System.out.println("Enter numbers (non-integer to finish):");
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 2 || !isPrime(n)) compositeCount++;
            else primeCount++;
        }
        System.out.printf("Composite numbers: %d%nPrime numbers: %d%n", compositeCount, primeCount);
    }
    public static boolean isPrime(int n) {
        if (n <= 3) return n > 1;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
