package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.SameEnds.sameEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SameEndsTests {

    @Test
    public void shouldReturnSameEnds() {
        assertThat(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1), is(equalTo(false)));
        assertThat(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2), is(equalTo(true)));
        assertThat(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3), is(equalTo(false)));
    }
}