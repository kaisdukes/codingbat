package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.WordsFront.wordsFront;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordsFrontTests {

    @Test
    public void shouldReturnWordsFront() {
        assertThat(wordsFront(new String[]{"a", "b", "c", "d"}, 1), is(equalTo(new String[]{"a"})));
        assertThat(wordsFront(new String[]{"a", "b", "c", "d"}, 2), is(equalTo(new String[]{"a", "b"})));
        assertThat(wordsFront(new String[]{"a", "b", "c", "d"}, 3), is(equalTo(new String[]{"a", "b", "c"})));
    }
}