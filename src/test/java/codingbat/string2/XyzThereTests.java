package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.XyzThere.xyzThere;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class XyzThereTests {

    @Test
    public void shouldReturnXyzThere() {
        assertThat(xyzThere("abcxyz"), is(equalTo(true)));
        assertThat(xyzThere("abc.xyz"), is(equalTo(false)));
        assertThat(xyzThere("xyz.abc"), is(equalTo(true)));
    }
}