package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.AllStar.allStar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AllStarTests {

    @Test
    public void shouldReturnAllStar() {
        assertThat(allStar("hello"), is(equalTo("h*e*l*l*o")));
        assertThat(allStar("abc"), is(equalTo("a*b*c")));
        assertThat(allStar("ab"), is(equalTo("a*b")));
        assertThat(allStar("a"), is(equalTo("a")));
        assertThat(allStar(""), is(equalTo("")));
    }
}