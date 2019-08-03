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
    public void NoGaps__ReturnZero() {
        assertThat(binaryGap.solution(1), equalTo(0));
        assertThat(binaryGap.solution(4), equalTo(0));
        assertThat(binaryGap.solution(15), equalTo(0));
        assertThat(binaryGap.solution(32), equalTo(0));
        assertThat(binaryGap.solution(32), equalTo(0));
        assertThat(binaryGap.solution(61440), equalTo(0));
    }

    @Test
    public void OneGap__ReturnGapLength() {
        assertThat(binaryGap.solution(1073741825), equalTo(29));
        assertThat(binaryGap.solution(40960), equalTo(1));
    }

    @Test
    public void MultipleGaps__ReturnMaxGapLength() {
        assertThat(binaryGap.solution(529), equalTo(4));
        assertThat(binaryGap.solution(1208027393), equalTo(10));
        assertThat(binaryGap.solution(1041), equalTo(5));
    }
}
