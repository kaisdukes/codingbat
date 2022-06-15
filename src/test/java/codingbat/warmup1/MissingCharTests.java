package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.MissingChar.missingChar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MissingCharTests {

    @Test
    public void shouldReturnStringWithCharRemoved() {
        assertThat(missingChar("kitten", 1), is(equalTo("ktten")));
        assertThat(missingChar("kitten", 0), is(equalTo("itten")));
        assertThat(missingChar("kitten", 4), is(equalTo("kittn")));
    }
}