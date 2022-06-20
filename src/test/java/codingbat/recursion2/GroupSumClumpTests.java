package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.GroupSumClump.groupSumClump;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupSumClumpTests {

    @Test
    public void shouldReturnGroupSumClump() {
        assertThat(groupSumClump(0, new int[]{2, 4, 8}, 10), is(equalTo(true)));
        assertThat(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14), is(equalTo(true)));
        assertThat(groupSumClump(0, new int[]{2, 4, 4, 8}, 14), is(equalTo(false)));
    }
}