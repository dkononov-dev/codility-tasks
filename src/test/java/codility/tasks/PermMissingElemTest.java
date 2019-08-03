package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PermMissingElemTest {

    private PermMissingElem permMissingElem;

    @Before
    public void setup() {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void MissingFirstElement__ReturnFirstElemen() {
        assertThat(permMissingElem.solution(new int[]{2,3,4,5}), equalTo(1));
    }

    @Test
    public void MissingSecondLastElement__ReturnSecondLastElemen() {
        assertThat(permMissingElem.solution(new int[]{1,2,3,4,6}), equalTo(5));
    }

    @Test
    public void MissingMiddleElement__ReturnMiddleElemen() {
        assertThat(permMissingElem.solution(new int[]{1,2,4,5}), equalTo(3));
    }
}
