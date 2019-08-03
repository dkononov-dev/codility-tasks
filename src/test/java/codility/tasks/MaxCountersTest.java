package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class MaxCountersTest {

    private MaxCounters maxCounters;

    @Before
    public void setup() {
        maxCounters = new MaxCounters();
    }

    @Test
    public void MaxCounterInTheMiddle__ReturnIndividualCounters() {
        assertThat(maxCounters.solution(5, new int[]{4, 4, 6, 1, 4, 4}), equalTo(new int[]{3, 2, 2, 4, 2}));
    }

    @Test
    public void MaxCounterLast__ReturnMaxCounter() {
        assertThat(maxCounters.solution(5, new int[]{4, 4, 6, 1, 4, 4, 6}), equalTo(new int[]{4, 4, 4, 4, 4}));
    }
}