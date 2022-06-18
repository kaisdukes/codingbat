package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.DoubleChar.doubleChar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DoubleCharTests {

    @Test
    public void shouldReturnDoubleChar() {
        assertThat(doubleChar("The"), is(equalTo("TThhee")));
        assertThat(doubleChar("AAbb"), is(equalTo("AAAAbbbb")));
        assertThat(doubleChar("Hi-There"), is(equalTo("HHii--TThheerree")));
        assertThat(doubleChar(""), is(equalTo("")));
    }
}