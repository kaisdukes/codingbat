package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.GroupNoAdj.groupNoAdj;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupNoAdjTests {

    @Test
    public void shouldReturnGroupNoAdj() {
        assertThat(groupNoAdj(0, new int[]{2, 5, 10, 4}, 12), is(equalTo(true)));
        assertThat(groupNoAdj(0, new int[]{2, 5, 10, 4}, 14), is(equalTo(false)));
        assertThat(groupNoAdj(0, new int[]{2, 5, 10, 4}, 7), is(equalTo(false)));
    }
}