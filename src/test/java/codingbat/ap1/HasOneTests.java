package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.HasOne.hasOne;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HasOneTests {

    @Test
    public void shouldReturnHasOne() {
        assertThat(hasOne(10), is(equalTo(true)));
        assertThat(hasOne(22), is(equalTo(false)));
        assertThat(hasOne(220), is(equalTo(false)));
    }
}