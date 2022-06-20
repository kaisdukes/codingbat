package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.GroupSum6.groupSum6;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupSum6Tests {

    @Test
    public void shouldReturnGroupSum6() {
        assertThat(groupSum6(0, new int[]{5, 6, 2}, 8), is(equalTo(true)));
        assertThat(groupSum6(0, new int[]{5, 6, 2}, 9), is(equalTo(false)));
        assertThat(groupSum6(0, new int[]{5, 6, 2}, 7), is(equalTo(false)));
    }
}