package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.TwoChar.twoChar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TwoCharTests {

    @Test
    public void shouldReturnTwoChar() {
        assertThat(twoChar("java", 0), is(equalTo("ja")));
        assertThat(twoChar("java", 2), is(equalTo("va")));
        assertThat(twoChar("java", 3), is(equalTo("ja")));
    }
}