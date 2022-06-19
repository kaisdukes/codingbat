package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.StrCount.strCount;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StrCountTests {

    @Test
    public void shouldReturnStrCount() {
        assertThat(strCount("catcowcat", "cat"), is(equalTo(2)));
        assertThat(strCount("catcowcat", "cow"), is(equalTo(1)));
        assertThat(strCount("catcowcat", "dog"), is(equalTo(0)));
        assertThat(strCount("iiiijj", "iii"), is(equalTo(1)));
    }
}