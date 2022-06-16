package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.NonStart.nonStart;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NonStartTests {

    @Test
    public void shouldReturnNonStart() {
        assertThat(nonStart("Hello", "There"), is(equalTo("ellohere")));
        assertThat(nonStart("java", "code"), is(equalTo("avaode")));
        assertThat(nonStart("shotl", "java"), is(equalTo("hotlava")));
    }
}