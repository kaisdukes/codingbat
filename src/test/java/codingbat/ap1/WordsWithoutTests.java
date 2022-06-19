package codingbat.ap1;

import org.junit.Test;

import java.util.List;

import static codingbat.ap1.WordsWithout.wordsWithout;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordsWithoutTests {

    @Test
    public void shouldReturnWordsWithout() {
        assertThat(
                wordsWithout(new String[]{"a", "bb", "b", "ccc"}, 1),
                is(equalTo(List.of("bb", "ccc"))));

        assertThat(
                wordsWithout(new String[]{"a", "bb", "b", "ccc"}, 3),
                is(equalTo(List.of("a", "bb", "b"))));

        assertThat(
                wordsWithout(new String[]{"a", "bb", "b", "ccc"}, 4),
                is(equalTo(List.of("a", "bb", "b", "ccc"))));
    }
}