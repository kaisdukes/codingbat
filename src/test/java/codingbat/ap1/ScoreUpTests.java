package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.ScoreUp.scoreUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScoreUpTests {

    @Test
    public void shouldReturnScoreUp() {
        assertThat(
                scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}),
                is(equalTo(6)));

        assertThat(
                scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}),
                is(equalTo(11)));

        assertThat(
                scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}),
                is(equalTo(16)));

        assertThat(
                scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "?", "?"}),
                is(equalTo(-1)));
    }
}