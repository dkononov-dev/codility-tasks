package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class MaxTripletTest {

    private MaxTriplet maxTriplet;

    @Before
    public void setup(){
        maxTriplet = new MaxTriplet();
    }

    @Test
    public void AllPositive__ReturnProductOfMaxThree() {
        assertThat(maxTriplet.solution(new int[]{1,2,3,4,5}), equalTo(60));
    }

    @Test
    public void OneNegative__ReturnProductOfMaxThreePositive() {
        assertThat(maxTriplet.solution(new int[]{1,2,3,4,5,-100}), equalTo(60));
    }

    @Test
    public void TwoNegative__ReturnProductOfMaxThree() {
        assertThat(maxTriplet.solution(new int[]{1,2,3,4,5,-10,-20}), equalTo(1000));
    }

}
