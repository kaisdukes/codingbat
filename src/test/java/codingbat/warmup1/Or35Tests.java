package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Or35.or35;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Or35Tests {

    @Test
    public void shouldReturnTrueIfMultipleOf3OrMultipleOf5() {
        assertThat(or35(3), is(equalTo(true)));
        assertThat(or35(10), is(equalTo(true)));
        assertThat(or35(8), is(equalTo(false)));
    }
}