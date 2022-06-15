package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.FrontBack.frontBack;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FrontBackTests {

    @Test
    public void shouldSwapFirstAndLastChars() {
        assertThat(frontBack("code"), is(equalTo("eodc")));
        assertThat(frontBack("a"), is(equalTo("a")));
        assertThat(frontBack("ab"), is(equalTo("ba")));
        assertThat(frontBack(""), is(equalTo("")));
    }
}