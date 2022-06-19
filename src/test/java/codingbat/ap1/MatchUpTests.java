package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.MatchUp.matchUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatchUpTests {

    @Test
    public void shouldMatchUp() {
        assertThat(
                matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}),
                is(equalTo(1)));

        assertThat(
                matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}),
                is(equalTo(2)));

        assertThat(
                matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}),
                is(equalTo(1)));
    }
}