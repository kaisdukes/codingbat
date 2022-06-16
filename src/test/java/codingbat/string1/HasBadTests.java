package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.HasBad.hasBad;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HasBadTests {

    @Test
    public void shouldReturnHasBad() {
        assertThat(hasBad("badxx"), is(equalTo(true)));
        assertThat(hasBad("xbadxx"), is(equalTo(true)));
        assertThat(hasBad("xxbadxx"), is(equalTo(false)));
    }
}