package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.MixStart.mixStart;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MixStartTests {

    @Test
    public void shouldReturnMixStart() {
        assertThat(mixStart("mix snacks"), is(equalTo(true)));
        assertThat(mixStart("pix snacks"), is(equalTo(true)));
        assertThat(mixStart("piz snacks"), is(equalTo(false)));
        assertThat(mixStart("mix"), is(equalTo(true)));
        assertThat(mixStart("ab"), is(equalTo(false)));
        assertThat(mixStart("a"), is(equalTo(false)));
        assertThat(mixStart(""), is(equalTo(false)));
    }
}