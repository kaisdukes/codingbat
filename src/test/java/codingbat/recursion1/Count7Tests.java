package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Count7.count7;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Count7Tests {

    @Test
    public void shouldCount7() {
        assertThat(count7(717), is(equalTo(2)));
        assertThat(count7(7), is(equalTo(1)));
        assertThat(count7(123), is(equalTo(0)));
        assertThat(count7(0), is(equalTo(0)));
    }
}