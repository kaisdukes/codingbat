package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.WordsCount.wordsCount;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordsCountTests {

    @Test
    public void shouldReturnWordsCount() {
        assertThat(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1), is(equalTo(2)));
        assertThat(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3), is(equalTo(1)));
        assertThat(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4), is(equalTo(0)));
    }
}