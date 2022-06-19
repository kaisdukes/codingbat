package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.CopyEndy.copyEndy;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CopyEndyTests {

    @Test
    public void shouldCopyEndy() {
        assertThat(copyEndy(new int[]{9, 11, 90, 22, 6}, 2), is(equalTo(new int[]{9, 90})));
        assertThat(copyEndy(new int[]{9, 11, 90, 22, 6}, 3), is(equalTo(new int[]{9, 90, 6})));
        assertThat(copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2), is(equalTo(new int[]{1, 1})));
    }
}