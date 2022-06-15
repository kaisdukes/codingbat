package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.BackAround.backAround;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BackAroundTests {

    @Test
    public void shouldReturnBackAround() {
        assertThat(backAround("cat"), is(equalTo("tcatt")));
        assertThat(backAround("Hello"), is(equalTo("oHelloo")));
        assertThat(backAround("a"), is(equalTo("aaa")));
    }
}