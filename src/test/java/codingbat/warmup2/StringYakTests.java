package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringYak.stringYak;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringYakTests {

    @Test
    public void shouldReturnStringYak() {
        assertThat(stringYak("yakpak"), is(equalTo("pak")));
        assertThat(stringYak("pakyak"), is(equalTo("pak")));
        assertThat(stringYak("yak123ya"), is(equalTo("123ya")));
        assertThat(stringYak("yak"), is(equalTo("")));
        assertThat(stringYak("yakxxxyak"), is(equalTo("xxx")));
        assertThat(stringYak("HiyakHi"), is(equalTo("HiHi")));
        assertThat(stringYak("xxxyakyyyakzzz"), is(equalTo("xxxyyzzz")));
    }
}