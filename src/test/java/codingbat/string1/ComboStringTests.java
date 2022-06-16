package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.ComboString.comboString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ComboStringTests {

    @Test
    public void shouldReturnComboString() {
        assertThat(comboString("Hello", "hi"), is(equalTo("hiHellohi")));
        assertThat(comboString("hi", "Hello"), is(equalTo("hiHellohi")));
        assertThat(comboString("aaa", "b"), is(equalTo("baaab")));
    }
}