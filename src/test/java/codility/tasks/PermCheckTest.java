package codility.tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PermCheckTest {

    private PermCheck permCheck;

    @Before
    public void setup() {
        permCheck = new PermCheck();
    }

    @Test
    public void Permutation__ReturnOne() {
        assertThat(permCheck.solution(new int[]{1, 2, 4, 3}), equalTo(1));
    }

    @Test
    public void NotPermutation__ReturnZero() {
        assertThat(permCheck.solution(new int[]{1, 2, 4, 1}), equalTo(0));
    }
}
