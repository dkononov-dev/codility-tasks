package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setup() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void test() {
        assertEquals(0, binaryGap.solution(1));
        assertEquals(0, binaryGap.solution(4));
        assertEquals(1, binaryGap.solution(5));
        assertEquals(2, binaryGap.solution(9));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(5, binaryGap.solution(1041));


    }
}
