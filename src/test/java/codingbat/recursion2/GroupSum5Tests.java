package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.GroupSum5.groupSum5;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GroupSum5Tests {

    @Test
    public void shouldReturnGroupSum5() {
        assertThat(groupSum5(0, new int[]{2, 5, 10, 4}, 19), is(equalTo(true)));
        assertThat(groupSum5(0, new int[]{2, 5, 10, 4}, 17), is(equalTo(true)));
        assertThat(groupSum5(0, new int[]{2, 5, 10, 4}, 12), is(equalTo(false)));
        assertThat(groupSum5(0, new int[]{3, 5, 1}, 9), is(equalTo(false)));
    }
}