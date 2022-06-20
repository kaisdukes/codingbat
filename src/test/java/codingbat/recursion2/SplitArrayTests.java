package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.SplitArray.splitArray;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SplitArrayTests {

    @Test
    public void shouldSplitArray() {
        assertThat(splitArray(new int[]{2, 2}), is(equalTo(true)));
        assertThat(splitArray(new int[]{2, 3}), is(equalTo(false)));
        assertThat(splitArray(new int[]{5, 2, 3}), is(equalTo(true)));
    }
}