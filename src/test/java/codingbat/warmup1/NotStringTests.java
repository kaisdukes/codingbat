package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.NotString.notString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NotStringTests {

    @Test
    public void shouldReturnNotString() {
        assertThat(notString("candy"), is(equalTo("not candy")));
        assertThat(notString("x"), is(equalTo("not x")));
        assertThat(notString("not bad"), is(equalTo("not bad")));
        assertThat(notString("nothing"), is(equalTo("nothing")));
    }
}