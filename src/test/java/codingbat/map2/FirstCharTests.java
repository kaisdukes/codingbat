package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.FirstChar.firstChar;
import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FirstCharTests {

    @Test
    public void shouldReturnFirstChar() {
        assertThat(
                firstChar(new String[]{"salt", "tea", "soda", "toast"}),
                is(equalTo(Map.of("s", "saltsoda", "t", "teatoast"))));

        assertThat(
                firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}),
                is(equalTo(Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"))));

        assertThat(firstChar(new String[]{}), is(equalTo(emptyMap())));
    }
}