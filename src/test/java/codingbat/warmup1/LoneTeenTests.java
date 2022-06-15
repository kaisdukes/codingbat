package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.LoneTeen.loneTeen;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoneTeenTests {

    @Test
    public void shouldReturnLoneTeen() {
        assertThat(loneTeen(13, 99), is(equalTo(true)));
        assertThat(loneTeen(21, 19), is(equalTo(true)));
        assertThat(loneTeen(13, 13), is(equalTo(false)));
        assertThat(loneTeen(0, 0), is(equalTo(false)));
    }
}