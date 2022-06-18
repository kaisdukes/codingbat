package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Sum28.sum28;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Sum28Tests {

    @Test
    public void shouldReturnSum28() {
        assertThat(sum28(new int[]{2, 3, 2, 2, 4, 2}), is(equalTo(true)));
        assertThat(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}), is(equalTo(false)));
        assertThat(sum28(new int[]{1, 2, 3, 4}), is(equalTo(false)));
    }
}