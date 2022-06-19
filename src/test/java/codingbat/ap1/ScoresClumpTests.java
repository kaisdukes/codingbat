package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.ScoresClump.scoresClump;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ScoresClumpTests {

    @Test
    public void shouldReturnScoresClump() {
        assertThat(scoresClump(new int[]{3, 4, 5}), is(equalTo(true)));
        assertThat(scoresClump(new int[]{3, 4, 6}), is(equalTo(false)));
        assertThat(scoresClump(new int[]{1, 3, 5, 5}), is(equalTo(true)));
    }
}