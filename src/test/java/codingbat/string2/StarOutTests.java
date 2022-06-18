package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.StarOut.starOut;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StarOutTests {

    @Test
    public void shouldReturnStarOut() {
        assertThat(starOut("ab*cd"), is(equalTo("ad")));
        assertThat(starOut("ab**cd"), is(equalTo("ad")));
        assertThat(starOut("sm*eilly"), is(equalTo("silly")));
    }
}