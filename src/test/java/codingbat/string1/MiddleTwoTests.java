package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.MiddleTwo.middleTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MiddleTwoTests {

    @Test
    public void shouldReturnMiddleTwo() {
        assertThat(middleTwo("string"), is(equalTo("ri")));
        assertThat(middleTwo("code"), is(equalTo("od")));
        assertThat(middleTwo("Practice"), is(equalTo("ct")));
    }
}