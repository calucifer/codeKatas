package codekatas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static org.junit.Assert.assertTrue;

public class SumDigPowerSpec {
    SumDigPower sum = new SumDigPower();
    List<Long> results;
    List<Long> expectedResults;

    @Test
    public void SumDigiPower_SingleTrueResult() {
        results = new ArrayList<>();
        expectedResults = new ArrayList<>();
        expectedResults.add(1L);
        results = sum.sumDigPow(1L, 1L);


        assertTrue(format("I got %1$s and expected %2$s", results.toString(), expectedResults.toString()), sum.sumDigPow(1L, 1L).toString().equals(expectedResults.toString()));
    }

    @Test
    public void SumDigiPower_MultipleResults() {
        results = new ArrayList<>();
        results.add(1L);
        results.add(2L);
        results.add(3L);
        results.add(4L);
        results.add(5L);
        results.add(6L);
        results.add(7L);
        results.add(8L);
        results.add(9L);
        results.add(89L);
        assertTrue(format("I got %1$s and expected %2$s", results.toString(), expectedResults.toString()), sum.sumDigPow(18L, 20L) == results);
    }

    @Test
    public void SumDigiPower_NoResults() {
        results = new ArrayList<>();
        assertTrue(sum.sumDigPow(20L, 40L) == results);
    }
}
