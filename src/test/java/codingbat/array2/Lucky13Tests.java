package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Lucky13.lucky13;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Lucky13Tests {

    @Test
    public void shouldReturnLucky13() {
        assertThat(lucky13(new int[]{0, 2, 4}), is(equalTo(true)));
        assertThat(lucky13(new int[]{1, 2, 3}), is(equalTo(false)));
        assertThat(lucky13(new int[]{1, 2, 4}), is(equalTo(false)));
    }
}