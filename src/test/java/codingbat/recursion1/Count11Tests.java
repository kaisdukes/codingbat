package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Count11.count11;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Count11Tests {

    @Test
    public void shouldCount11() {
        assertThat(count11("11abc11"), is(equalTo(2)));
        assertThat(count11("abc11x11x11"), is(equalTo(3)));
        assertThat(count11("111"), is(equalTo(1)));
    }
}