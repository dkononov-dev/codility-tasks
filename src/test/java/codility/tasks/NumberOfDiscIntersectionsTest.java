package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class NumberOfDiscIntersectionsTest {

    private NumberOfDiscIntersections numberOfDiscIntersections;

    @Before
    public void setup() {
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    public void whenDiscsIntersect__thenCorrectCountReturned() {
        assertThat(numberOfDiscIntersections.solution(new int[]{1, 5, 2, 1, 4, 0}), equalTo(11));
        assertThat(numberOfDiscIntersections.solution(new int[]{1,0,0,3}), equalTo(4));
    }

}
