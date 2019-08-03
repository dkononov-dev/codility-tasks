package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne;

    @Before
    public void setup() {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void NotPossibleToCross__ReturnMinusOne() {
        assertThat(frogRiverOne.solution(3, new int[]{1,2,1,2,1,1}), equalTo(-1));
    }

    @Test
    public void PossibleToCross__ReturnEarliest() {
        assertThat(frogRiverOne.solution(5, new int[]{1,2,4,5,4,5,1,3,1,4,3}), equalTo(7));
    }
}
