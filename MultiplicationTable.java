import java.util.Scanner;

public class MultiplicationTable {
    private int tableSize;

    public MultiplicationTable(int size) {
        this.tableSize = size;
    }

    public void generateTable() {
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();  // Move to the next line for the next row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int tableSize = scanner.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable(tableSize);
        multiplicationTable.generateTable();

        scanner.close();
    }
}
