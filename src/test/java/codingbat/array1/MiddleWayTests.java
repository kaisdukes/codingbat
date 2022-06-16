package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MiddleWay.middleWay;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MiddleWayTests {

    @Test
    public void shouldReturnMiddleWay() {
        assertThat(middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}), is(equalTo(new int[]{2, 5})));
        assertThat(middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}), is(equalTo(new int[]{7, 8})));
        assertThat(middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}), is(equalTo(new int[]{2, 4})));
    }
}