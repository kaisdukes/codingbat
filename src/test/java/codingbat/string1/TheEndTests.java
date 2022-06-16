package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.TheEnd.theEnd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TheEndTests {

    @Test
    public void shouldReturnTheEnd() {
        assertThat(theEnd("Hello", true), is(equalTo("H")));
        assertThat(theEnd("Hello", false), is(equalTo("o")));
        assertThat(theEnd("oh", true), is(equalTo("o")));
    }
}