package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.BunnyEars.bunnyEars;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BunnyEarsTests {

    @Test
    public void shouldReturnBunnyEars() {
        assertThat(bunnyEars(0), is(equalTo(0)));
        assertThat(bunnyEars(1), is(equalTo(2)));
        assertThat(bunnyEars(2), is(equalTo(4)));
    }
}