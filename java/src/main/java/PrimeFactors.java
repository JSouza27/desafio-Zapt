import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    private List<Integer> list = new ArrayList<>();

    public Integer sumPrimeFactors(Long n) {

        Long result = Long.valueOf(n);

        for (int i = 2; result != 1; i++) {
            if (n % i == 0) {
                list.add(i);

                result = result / i;
            }
        }

        return Collections.max(list);
    }
}
