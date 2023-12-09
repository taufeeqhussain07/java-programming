import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name (or 'stop' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            names.add(name);
        }
        System.out.print("Enter 'asc' for ascending or 'desc' for descending order: ");
        String sortOrder = scanner.nextLine();
        if (sortOrder.equalsIgnoreCase("asc")) {
            Collections.sort(names);
        } else if (sortOrder.equalsIgnoreCase("desc")) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sorting order specified. Names will not be sorted.");
        }
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
