package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.EqualIsNot.equalIsNot;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EqualIsNotTests {

    @Test
    public void shouldReturnEqualIsNot() {
        assertThat(equalIsNot("This is not"), is(equalTo(false)));
        assertThat(equalIsNot("This is notnot"), is(equalTo(true)));
        assertThat(equalIsNot("noisxxnotyynotxisi"), is(equalTo(true)));
    }
}