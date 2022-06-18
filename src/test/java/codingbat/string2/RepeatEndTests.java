package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.RepeatEnd.repeatEnd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RepeatEndTests {

    @Test
    public void shouldRepeatEnd() {
        assertThat(repeatEnd("Hello", 3), is(equalTo("llollollo")));
        assertThat(repeatEnd("Hello", 2), is(equalTo("lolo")));
        assertThat(repeatEnd("Hello", 1), is(equalTo("o")));
    }
}