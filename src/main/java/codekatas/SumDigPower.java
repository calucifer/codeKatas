package codekatas;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public List<Long> sumDigPow(long a, long b) {
        List<Long> results = new ArrayList<>();

        for (Long digit = a; digit <= b; digit++) {
            String value = new String();
            String d = digit.toString();
            for (int i = 1; i <= d.length(); i++) {
                char v = d.charAt(i - 1);
                int n = Integer.parseInt(Character.toString(v));

                value = value.concat(Integer.toString(i * Integer.parseInt(Character.toString(v))));
            }
            if (Long.getLong(value) == digit) {
                results.add(digit);
            }
        }

        return results;

    }
}
