package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Either24.either24;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Either24Tests {

    @Test
    public void shouldReturnEither24() {
        assertThat(either24(new int[]{1, 2, 2}), is(equalTo(true)));
        assertThat(either24(new int[]{4, 4, 1}), is(equalTo(true)));
        assertThat(either24(new int[]{4, 4, 1, 2, 2}), is(equalTo(false)));
    }
}