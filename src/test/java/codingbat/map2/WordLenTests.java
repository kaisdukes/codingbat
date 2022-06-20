package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.WordLen.wordLen;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordLenTests {

    @Test
    public void shouldReturnWordLen() {
        assertThat(
                wordLen(new String[]{"a", "bb", "a", "bb"}),
                is(equalTo(Map.of("bb", 2, "a", 1))));

        assertThat(
                wordLen(new String[]{"this", "and", "that", "and"}),
                is(equalTo(Map.of("that", 4, "and", 3, "this", 4))));

        assertThat(
                wordLen(new String[]{"code", "code", "code", "bug"}),
                is(equalTo(Map.of("code", 4, "bug", 3))));
    }
}