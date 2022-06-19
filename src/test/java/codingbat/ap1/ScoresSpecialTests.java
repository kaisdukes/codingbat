package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.ScoresSpecial.scoresSpecial;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScoresSpecialTests {

    @Test
    public void shouldReturnScoresSpecial() {
        assertThat(
                scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}),
                is(equalTo(40)));

        assertThat(
                scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}),
                is(equalTo(40)));

        assertThat(
                scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}),
                is(equalTo(20)));
    }
}