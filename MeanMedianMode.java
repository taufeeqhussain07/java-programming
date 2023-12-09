import java.util.*;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        double mean = Arrays.stream(arr).average().orElse(Double.NaN);
        double median = calculateMedian(arr);
        int mode = calculateMode(arr);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int middle = arr.length / 2;
        return (arr.length % 2 == 0) ? (arr[middle - 1] + arr[middle]) / 2.0 : arr[middle];
    }

    public static int calculateMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0, mode = 0;

        for (int num : arr) {
            int currentFrequency = frequencyMap.merge(num, 1, Integer::sum);
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = num;
            }
        }
        return mode;
    }
}
