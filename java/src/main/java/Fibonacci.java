import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private List<Integer> list = new ArrayList<>();
    private int currentValue = 2;
    private int previousValue = 1;

    public double fibonacciSum() {
        int sum = 0;

        while (previousValue < 4 * Math.pow(10, 6)) {
            if (currentValue % 2 == 0) {
                list.add(currentValue);
            };

            currentValue = previousValue + currentValue;
            previousValue = currentValue - previousValue;
        }

        for (Integer n : list) {
            sum += n;
        }

        return sum;
    }
}
