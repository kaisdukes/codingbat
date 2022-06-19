package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.ScoresAverage.scoresAverage;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScoresAverageTests {

    @Test
    public void shouldReturnScoresAverage() {
        assertThat(scoresAverage(new int[]{2, 2, 4, 4}), is(equalTo(4)));
        assertThat(scoresAverage(new int[]{4, 4, 4, 2, 2, 2}), is(equalTo(4)));
        assertThat(scoresAverage(new int[]{3, 4, 5, 1, 2, 3}), is(equalTo(4)));
        assertThat(scoresAverage(new int[]{5, 6}), is(equalTo(6)));
    }
}