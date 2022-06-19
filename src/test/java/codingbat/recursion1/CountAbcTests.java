package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.CountAbc.countAbc;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountAbcTests {

    @Test
    public void shouldCountAbc() {
        assertThat(countAbc("abc"), is(equalTo(1)));
        assertThat(countAbc("abcxxabc"), is(equalTo(2)));
        assertThat(countAbc("abaxxaba"), is(equalTo(2)));
    }
}