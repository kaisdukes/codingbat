package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.RotateLeft3.rotateLeft3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RotateLeft3Tests {

    @Test
    public void shouldRotateLeft3() {
        assertThat(rotateLeft3(new int[]{1, 2, 3}), is(equalTo(new int[]{2, 3, 1})));
        assertThat(rotateLeft3(new int[]{5, 11, 9}), is(equalTo(new int[]{11, 9, 5})));
        assertThat(rotateLeft3(new int[]{7, 0, 0}), is(equalTo(new int[]{0, 0, 7})));
    }
}