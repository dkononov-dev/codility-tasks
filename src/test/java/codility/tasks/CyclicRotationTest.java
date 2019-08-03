package codility.tasks;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CyclicRotationTest {

    private CyclicRotation rotateArray;

    @Before
    public void setup() {
        rotateArray = new CyclicRotation();
    }

    @Test
    public void RotateTimes__IsZero__ReturnTheSameArray() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3}, 0), equalTo(new int[] {-1,-2,-3}));
    }

    @Test
    public void NumberOfArrayElements__IsOne__ReturnTheSameArray() {
        assertThat(rotateArray.solution(new int[] {-1}, Integer.MAX_VALUE), equalTo(new int[] {-1}));
    }

    @Test
    public void RotateTimes__IsOne__ReturnArrayWithLastElementAtFront() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 1), equalTo(new int[] {7,-1,-2,-3}));
    }

    @Test
    public void RotateTimes__IsNumberOfArrayElements__ReturnTheSameArray() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 4), equalTo(new int[] {-1,-2,-3,7}));
    }

    @Test
    public void RotateTimesModuloNumberOfArrayElements__IsZero__ReturnTheSameArray() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 40), equalTo(new int[] {-1,-2,-3,7}));
    }

    @Test
    public void RotateTimesModuloNumberOfArrayElements__IsOne__ReturnArrayWithLastElementAtFront() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 41), equalTo(new int[] {7,-1,-2,-3}));
    }

    @Test
    public void RotateTime__IsTwo__ReturnArrayWithTwoLastElementsAtFront() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 2), equalTo(new int[] {-3,7,-1,-2}));
    }

    @Test
    public void RotateTimesModuloNumberOfArrayElements__IsTwo__ReturnArrayWithTwoLastElementsAtFront() {
        assertThat(rotateArray.solution(new int[] {-1,-2,-3,7}, 42), equalTo(new int[] {-3,7,-1,-2}));
    }
}
