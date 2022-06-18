package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.RepeatSeparator.repeatSeparator;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RepeatSeparatorTests {

    @Test
    public void shouldRepeatSeparator() {
        assertThat(repeatSeparator("Word", "X", 3), is(equalTo("WordXWordXWord")));
        assertThat(repeatSeparator("This", "And", 2), is(equalTo("ThisAndThis")));
        assertThat(repeatSeparator("This", "And", 1), is(equalTo("This")));
    }
}