package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Count8.count8;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Count8Tests {

    @Test
    public void shouldCount8() {
        assertThat(count8(8), is(equalTo(1)));
        assertThat(count8(818), is(equalTo(2)));
        assertThat(count8(8818), is(equalTo(4)));
    }
}