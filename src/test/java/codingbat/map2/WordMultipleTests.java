package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.WordMultiple.wordMultiple;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordMultipleTests {

    @Test
    public void shouldReturnWordMultiple() {
        assertThat(
                wordMultiple(new String[]{"a", "b", "a", "c", "b"}),
                is(equalTo(Map.of("a", true, "b", true, "c", false))));

        assertThat(
                wordMultiple(new String[]{"c", "b", "a"}),
                is(equalTo(Map.of("a", false, "b", false, "c", false))));

        assertThat(
                wordMultiple(new String[]{"c", "c", "c", "c"}),
                is(equalTo(Map.of("c", true))));
    }
}