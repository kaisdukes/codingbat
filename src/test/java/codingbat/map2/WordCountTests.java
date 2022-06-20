package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.WordCount.wordCount;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordCountTests {

    @Test
    public void shouldReturnWordCount() {
        assertThat(
                wordCount(new String[]{"a", "b", "a", "c", "b"}),
                is(equalTo(Map.of("a", 2, "b", 2, "c", 1))));

        assertThat(
                wordCount(new String[]{"c", "b", "a"}),
                is(equalTo(Map.of("a", 1, "b", 1, "c", 1))));

        assertThat(
                wordCount(new String[]{"c", "c", "c", "c"}),
                is(equalTo(Map.of("c", 4))));
    }
}