package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.WordsWithout.wordsWithout;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordsWithoutTests {

    @Test
    public void shouldReturnWordsWithout() {
        assertThat(
                wordsWithout(new String[]{"a", "b", "c", "a"}, "a"),
                is(equalTo(new String[]{"b", "c"})));

        assertThat(
                wordsWithout(new String[]{"a", "b", "c", "a"}, "b"),
                is(equalTo(new String[]{"a", "c", "a"})));

        assertThat(
                wordsWithout(new String[]{"a", "b", "c", "a"}, "c"),
                is(equalTo(new String[]{"a", "b", "a"})));
    }
}