package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.WithouEnd2.withouEnd2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithouEnd2Tests {

    @Test
    public void shouldReturnWithouEnd2() {
        assertThat(withouEnd2("Hello"), is(equalTo("ell")));
        assertThat(withouEnd2("abc"), is(equalTo("b")));
        assertThat(withouEnd2(""), is(equalTo("")));
    }
}