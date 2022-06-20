package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.SplitOdd10.splitOdd10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SplitOdd10Tests {

    @Test
    public void shouldSplitOdd10() {
        assertThat(splitOdd10(new int[]{5, 5, 5}), is(equalTo(true)));
        assertThat(splitOdd10(new int[]{5, 5, 6}), is(equalTo(false)));
        assertThat(splitOdd10(new int[]{5, 5, 6, 1}), is(equalTo(true)));
    }
}