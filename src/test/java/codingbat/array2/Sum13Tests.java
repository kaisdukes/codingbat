package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Sum13.sum13;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sum13Tests {

    @Test
    public void shouldReturnSum13() {
        assertThat(sum13(new int[]{1, 2, 2, 1}), is(equalTo(6)));
        assertThat(sum13(new int[]{1, 1}), is(equalTo(2)));
        assertThat(sum13(new int[]{1, 2, 2, 1, 13}), is(equalTo(6)));
        assertThat(sum13(new int[]{13, 1, 2, 13, 2, 1, 13}), is(equalTo(3)));
    }
}