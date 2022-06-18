package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.WordEnds.wordEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WordEndTests {

    @Test
    public void shouldReturnWordEnds() {
        assertThat(wordEnds("abcXY123XYijk", "XY"), is(equalTo("c13i")));
        assertThat(wordEnds("XY123XY", "XY"), is(equalTo("13")));
        assertThat(wordEnds("XY1XY", "XY"), is(equalTo("11")));
    }
}