package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setup() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void test() {
        assertThat(binaryGap.solution(1), equalTo(0));
        assertThat(binaryGap.solution(4), equalTo(0));
        assertThat(binaryGap.solution(5), equalTo(1));
        assertThat(binaryGap.solution(9), equalTo(2));
        assertThat(binaryGap.solution(15), equalTo(0));
        assertThat(binaryGap.solution(20), equalTo(1));
        assertThat(binaryGap.solution(32), equalTo(0));
        assertThat(binaryGap.solution(529), equalTo(4));
        assertThat(binaryGap.solution(1041), equalTo(5));
    }
}
