package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.HasTeen.hasTeen;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HasTeenTests {

    @Test
    public void shouldReturnHasTeen() {
        assertThat(hasTeen(13, 20, 10), is(equalTo(true)));
        assertThat(hasTeen(20, 19, 10), is(equalTo(true)));
        assertThat(hasTeen(20, 10, 13), is(equalTo(true)));
        assertThat(hasTeen(20, 10, 12), is(equalTo(false)));
        assertThat(hasTeen(0, 0, 0), is(equalTo(false)));
    }
}