package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.StrCopies.strCopies;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StrCopiesTests {

    @Test
    public void shouldReturnStrCopies() {
        assertThat(strCopies("catcowcat", "cat", 2), is(equalTo(true)));
        assertThat(strCopies("catcowcat", "cow", 2), is(equalTo(false)));
        assertThat(strCopies("catcowcat", "cow", 1), is(equalTo(true)));
    }
}