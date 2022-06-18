package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.SameStarChar.sameStarChar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SameStarCharTests {

    @Test
    public void shouldReturnSameStarChar() {
        assertThat(sameStarChar("xy*yzz"), is(equalTo(true)));
        assertThat(sameStarChar("xy*zzz"), is(equalTo(false)));
        assertThat(sameStarChar("*xa*az"), is(equalTo(true)));
    }
}