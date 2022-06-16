package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.AtFirst.atFirst;
import static codingbat.string1.ComboString.comboString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AtFirstTests {

    @Test
    public void shouldReturnAtFirst() {
        assertThat(atFirst("hello"), is(equalTo("he")));
        assertThat(atFirst("hi"), is(equalTo("hi")));
        assertThat(atFirst("h"), is(equalTo("h@")));
        assertThat(atFirst(""), is(equalTo("@@")));
    }
}