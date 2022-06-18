package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.PlusOut.plusOut;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PlusOutTests {

    @Test
    public void shouldReturnPlusOut() {
        assertThat(plusOut("12xy34", "xy"), is(equalTo("++xy++")));
        assertThat(plusOut("12xy34", "1"), is(equalTo("1+++++")));
        assertThat(plusOut("12xy34xyabcxy", "xy"), is(equalTo("++xy++xy+++xy")));
    }
}