package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.ScoresIncreasing.scoresIncreasing;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScoresIncreasingTests {

    @Test
    public void shouldReturnScoresIncreasing() {
        assertThat(scoresIncreasing(new int[]{1, 3, 4}), is(equalTo(true)));
        assertThat(scoresIncreasing(new int[]{1, 3, 2}), is(equalTo(false)));
        assertThat(scoresIncreasing(new int[]{1, 1, 4}), is(equalTo(true)));
    }
}