package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.Lower.lower;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LowerTests {

    @Test
    public void shouldReturnLower() {
        assertThat(lower(List.of("Hello", "Hi")), is(equalTo(List.of("hello", "hi"))));
        assertThat(lower(List.of("AAA", "BBB", "ccc")), is(equalTo(List.of("aaa", "bbb", "ccc"))));
        assertThat(lower(List.of("KitteN", "ChocolaTE")), is(equalTo(List.of("kitten", "chocolate"))));
        assertThat(lower(emptyList()), is(equalTo(emptyList())));
    }
}