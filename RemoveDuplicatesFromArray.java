import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] inputArray = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Remove duplicates in the array
        int[] resultArray = removeDuplicates(inputArray);

        // Display the result
        System.out.println("Original array with duplicates: " + arrayToString(inputArray));
        System.out.println("Array after removing duplicates: " + arrayToString(resultArray));

        // Close the scanner
        scanner.close();
    }

    // Function to remove duplicates from an array
    private static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, copy it to the result array
            if (!isDuplicate) {
                array[newSize++] = array[i];
            }
        }

        // Create a new array with the non-duplicate elements
        int[] resultArray = new int[newSize];
        System.arraycopy(array, 0, resultArray, 0, newSize);

        return resultArray;
    }

    // Function to convert an array to a string for display
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        int n = array.length;

        for (int i = 0; i < n; i++) {
            sb.append(array[i]);

            if (i < n - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
