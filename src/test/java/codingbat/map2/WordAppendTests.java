package codingbat.map2;

import org.junit.Test;

import static codingbat.map2.WordAppend.wordAppend;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordAppendTests {

    @Test
    public void shouldReturnWordAppend() {
        assertThat(wordAppend(new String[]{"a", "b", "a"}), is(equalTo("a")));
        assertThat(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}), is(equalTo("aa")));
        assertThat(wordAppend(new String[]{"a", "", "a"}), is(equalTo("a")));
        assertThat(wordAppend(new String[]{"a", "b", "c"}), is(equalTo("")));
    }
}