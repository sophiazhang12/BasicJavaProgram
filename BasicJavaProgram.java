import java.util.HashMap;
import java.util.Map;

public class BasicJavaProgram {

    public static double sumOfSquares(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num * num;
        }
        return sum;
    }
    
    public static double mode(double[] numbers) {
        // Create a frequency map to store the count of each number
        Map<Double, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (double num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with maximum frequency
        double mode = numbers[0];
        int maxFrequency = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        
        return mode;
    }

    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 4.0, 4.0, 5.0, 5.0};
        
        System.out.println("Sum of squares: " + sumOfSquares(numbers));
        System.out.println("Mode: " + mode(numbers));
    }
}
