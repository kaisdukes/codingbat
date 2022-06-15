package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.BackAround.backAround;
import static codingbat.warmup1.StartOz.startOz;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartOzTests {

    @Test
    public void shouldReturnStartOz() {
        assertThat(startOz("ozymandias"), is(equalTo("oz")));
        assertThat(startOz("bzoo"), is(equalTo("z")));
        assertThat(startOz("oxx"), is(equalTo("o")));
        assertThat(startOz("ab"), is(equalTo("")));
        assertThat(startOz("a"), is(equalTo("")));
        assertThat(startOz(""), is(equalTo("")));
    }
}