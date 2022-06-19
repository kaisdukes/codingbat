package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.PairStar.pairStar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PairStarTests {

    @Test
    public void shouldReturnPairStar() {
        assertThat(pairStar("hello"), is(equalTo("hel*lo")));
        assertThat(pairStar("xxyy"), is(equalTo("x*xy*y")));
        assertThat(pairStar("aaaa"), is(equalTo("a*a*a*a")));
        assertThat(pairStar("a"), is(equalTo("a")));
        assertThat(pairStar(""), is(equalTo("")));
    }
}