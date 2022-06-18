package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.RepeatFront.repeatFront;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RepeatFrontTests {

    @Test
    public void shouldRepeatFront() {
        assertThat(repeatFront("Chocolate", 4), is(equalTo("ChocChoChC")));
        assertThat(repeatFront("Chocolate", 3), is(equalTo("ChoChC")));
        assertThat(repeatFront("Ice Cream", 2), is(equalTo("IcI")));
    }
}