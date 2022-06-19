package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.CountClumps.countClumps;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountClumpsTests {

    @Test
    public void shouldCountClumps() {
        assertThat(countClumps(new int[]{1, 2, 2, 3, 4, 4}), is(equalTo(2)));
        assertThat(countClumps(new int[]{1, 1, 2, 1, 1}), is(equalTo(2)));
        assertThat(countClumps(new int[]{1, 1, 1, 1, 1}), is(equalTo(1)));
    }
}