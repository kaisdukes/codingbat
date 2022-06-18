package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.NotAlone.notAlone;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NotAloneTests {

    @Test
    public void shouldReturnNotAlone() {
        assertThat(notAlone(new int[]{1, 2, 3}, 2), is(equalTo(new int[]{1, 3, 3})));
        assertThat(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2), is(equalTo(new int[]{1, 3, 3, 5, 5, 2})));
        assertThat(notAlone(new int[]{3, 4}, 3), is(equalTo(new int[]{3, 4})));
    }
}