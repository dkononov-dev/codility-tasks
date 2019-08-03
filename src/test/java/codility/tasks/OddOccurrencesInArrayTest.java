package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setup() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @Test
    public void test() {
        assertThat(oddOccurrencesInArray.solution(new int[]{2,1,2}), equalTo(1));
        assertThat(oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}), equalTo(7));
    }
}
