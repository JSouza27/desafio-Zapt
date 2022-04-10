public class SumOfMultiples {

    private int multiples = 0;
    private int THREE = 3;
    private int FIVE = 5;

    public int sum (int n) {
        if (n <= 0) {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            if (i % THREE == 0 || i % FIVE == 0) {
                multiples += i;
            }
        }

        return multiples;
    }
}
