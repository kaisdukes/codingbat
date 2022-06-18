package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.OneTwo.oneTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OneTwoTests {

    @Test
    public void shouldReturnOneTwo() {
        assertThat(oneTwo("abc"), is(equalTo("bca")));
        assertThat(oneTwo("tca"), is(equalTo("cat")));
        assertThat(oneTwo("tcagdo"), is(equalTo("catdog")));
    }
}