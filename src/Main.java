import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.11, 56.65, 84.44, 65.58, -78.23, 15.1, 16.96, 44.7, 36.6, -10.2, -11.3, -88.11, -94.85, -100.01, -101.94};
        {
            boolean exception = true;
            double sum = 0;
            int count = 0;

            for (double value : numbers) {
                if (exception) {
                    if (value < 0) {
                        exception = false;
                    }
                } else if (value > 0) {
                    count++;
                    sum += value;
                }
            }

            System.out.println("Среднее арифметическое " + sum / count);
        }

        int n = numbers.length;
        {

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (numbers[j] < numbers[minIndex]) {
                        minIndex = j;
                    }
                }
                System.out.println(Arrays.toString(numbers));

                double a = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = a;
            }
        }
    }
}