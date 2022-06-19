package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.Scores100.scores100;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Scores100Tests {

    @Test
    public void shouldReturnScores100() {
        assertThat(scores100(new int[]{1, 100, 100}), is(equalTo(true)));
        assertThat(scores100(new int[]{1, 100, 99, 100}), is(equalTo(false)));
        assertThat(scores100(new int[]{100, 1, 100, 100}), is(equalTo(true)));
    }
}