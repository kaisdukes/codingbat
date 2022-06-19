package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.BunnyEars2.bunnyEars2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BunnyEars2Tests {

    @Test
    public void shouldReturnBunnyEars2() {
        assertThat(bunnyEars2(0), is(equalTo(0)));
        assertThat(bunnyEars2(1), is(equalTo(2)));
        assertThat(bunnyEars2(2), is(equalTo(5)));
        assertThat(bunnyEars2(3), is(equalTo(7)));
        assertThat(bunnyEars2(4), is(equalTo(10)));
    }
}