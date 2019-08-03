package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setup(){
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void TwoElements__ReturnDifference() {
        assertThat(tapeEquilibrium.solution(new int[]{1,10}), equalTo(9));
    }

    @Test
    public void OneHugeElement__ReturnDifferenceWithTheRestOfThem() {
        assertThat(tapeEquilibrium.solution(new int[]{1,2,3,1000}), equalTo(994));
    }

    @Test
    public void FewElements__ReturnMinDifference() {
        assertThat(tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}), equalTo(1));
    }
}
