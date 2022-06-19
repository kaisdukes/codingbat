package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.StrDist.strDist;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StrDistTests {

    @Test
    public void shouldReturnStrDist() {
        assertThat(strDist("catcowcat", "cat"), is(equalTo(9)));
        assertThat(strDist("catcowcat", "cow"), is(equalTo(3)));
        assertThat(strDist("cccatcowcatxx", "cat"), is(equalTo(9)));
    }
}