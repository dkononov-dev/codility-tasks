package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MissingIntegerTest {

    private MissingInteger missingInteger;

    @Before
    public void setup(){
        missingInteger = new MissingInteger();
    }

    @Test
    public void MissingOne_ReturnOne() {
        assertThat(missingInteger.solution(new int[]{2,3,4,5}), equalTo(1));
    }

    @Test
    public void AllNegatives_ReturnOne() {
        assertThat(missingInteger.solution(new int[]{-2,-3,-4,-5}), equalTo(1));
    }

    @Test
    public void StarFromOne_ReturnLastPlusOne() {
        assertThat(missingInteger.solution(new int[]{1,2,3,4,5}), equalTo(6));
    }

    @Test
    public void HundredThousand_ReturnHundredThousandOne() {
        int[] A = new int[100000];

        for(int i=0; i<100000; ) {
            A[i] = ++i;
        }

        assertThat(missingInteger.solution(A), equalTo(100001));
    }
}
