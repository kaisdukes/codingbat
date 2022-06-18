package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.MatchUp.matchUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatchUpTests {

    @Test
    public void shouldMatchUp() {
        assertThat(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}), is(equalTo(2)));
        assertThat(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}), is(equalTo(3)));
        assertThat(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}), is(equalTo(2)));
    }
}