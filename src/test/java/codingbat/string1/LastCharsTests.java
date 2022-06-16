package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.AtFirst.atFirst;
import static codingbat.string1.LastChars.lastChars;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LastCharsTests {

    @Test
    public void shouldReturnLastChars() {
        assertThat(lastChars("last", "chars"), is(equalTo("ls")));
        assertThat(lastChars("yo", "java"), is(equalTo("ya")));
        assertThat(lastChars("hi", ""), is(equalTo("h@")));
        assertThat(lastChars("", "hi"), is(equalTo("@i")));
        assertThat(lastChars("", ""), is(equalTo("@@")));
    }
}