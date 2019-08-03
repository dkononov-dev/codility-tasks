package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PassingCarsTest {

    private PassingCars passingCars;

    @Before
    public void setup(){
        passingCars = new PassingCars();
    }

    @Test
    public void TravelEastAndWest__ReturnPassingCarsCount() {
        assertThat(passingCars.solution(new int[]{0,1,0,1,1}), equalTo(5));
    }

    @Test
    public void TravelEastOnly__ReturnZero() {
        assertThat(passingCars.solution(new int[]{0,0,0,0,0}), equalTo(0));
    }

    @Test
    public void TravelWestOnly__ReturnZero() {
        assertThat(passingCars.solution(new int[]{1,1,1,1,1}), equalTo(0));
    }

    @Test
    public void DontPass__ReturnZero() {
        assertThat(passingCars.solution(new int[]{1,1,1,1,1,0,0,0,0,0,0,0}), equalTo(0));
    }
}
