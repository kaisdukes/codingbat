package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.GroupSum.groupSum;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupSumTests {

    @Test
    public void shouldReturnGroupSum() {
        assertThat(groupSum(0, new int[]{2, 4, 8}, 10), is(equalTo(true)));
        assertThat(groupSum(0, new int[]{2, 4, 8}, 14), is(equalTo(true)));
        assertThat(groupSum(0, new int[]{2, 4, 8}, 9), is(equalTo(false)));
    }
}