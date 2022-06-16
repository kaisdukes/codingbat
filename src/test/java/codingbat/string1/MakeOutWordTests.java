package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.HelloName.helloName;
import static codingbat.string1.MakeOutWord.makeOutWord;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeOutWordTests {

    @Test
    public void shouldMakeOutWord() {
        assertThat(makeOutWord("<<>>", "Yay"), is(equalTo("<<Yay>>")));
        assertThat(makeOutWord("<<>>", "WooHoo"), is(equalTo("<<WooHoo>>")));
        assertThat(makeOutWord("[[]]", "word"), is(equalTo("[[word]]")));
    }
}