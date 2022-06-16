package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.AtFirst.atFirst;
import static codingbat.string1.StartWord.startWord;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartWordTests {

    @Test
    public void shouldReturnStartWord() {
        assertThat(startWord("hippo", "hi"), is(equalTo("hi")));
        assertThat(startWord("hippo", "xip"), is(equalTo("hip")));
        assertThat(startWord("hippo", "i"), is(equalTo("h")));
        assertThat(startWord("", "i"), is(equalTo("")));
    }
}