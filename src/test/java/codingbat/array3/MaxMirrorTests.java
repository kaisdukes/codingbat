package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.MaxMirror.maxMirror;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxMirrorTests {

    @Test
    public void shouldReturnMaxMirror() {
        assertThat(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}), is(equalTo(3)));
        assertThat(maxMirror(new int[]{1, 2, 1, 4}), is(equalTo(3)));
        assertThat(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}), is(equalTo(2)));
    }
}