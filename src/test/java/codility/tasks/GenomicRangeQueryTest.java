package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GenomicRangeQueryTest {

    private GenomicRangeQuery genomicRangeQuery;

    @Before
    public void setup() {
        genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    public void test() {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expected = {2, 4, 1};
        assertThat(genomicRangeQuery.solution("CAGCCTA", P, Q), equalTo(expected));
    }
}
