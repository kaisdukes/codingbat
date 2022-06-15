package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Diff21.diff21;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Diff21Tests {

    @Test
    public void shouldReturnDiffOrDoubleDiff() {
        assertThat(diff21(18), is(equalTo(3)));
        assertThat(diff21(19), is(equalTo(2)));
        assertThat(diff21(20), is(equalTo(1)));
        assertThat(diff21(21), is(equalTo(0)));
        assertThat(diff21(22), is(equalTo(2)));
        assertThat(diff21(23), is(equalTo(4)));
    }
}