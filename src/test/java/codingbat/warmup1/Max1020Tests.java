package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Max1020.max1020;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Max1020Tests {

    @Test
    public void shouldReturnMax1020() {
        assertThat(max1020(11, 19), is(equalTo(19)));
        assertThat(max1020(19, 11), is(equalTo(19)));
        assertThat(max1020(11, 9), is(equalTo(11)));
        assertThat(max1020(9, 11), is(equalTo(11)));
        assertThat(max1020(10, 200), is(equalTo(10)));
        assertThat(max1020(200, 10), is(equalTo(10)));
        assertThat(max1020(200, 300), is(equalTo(0)));
    }
}