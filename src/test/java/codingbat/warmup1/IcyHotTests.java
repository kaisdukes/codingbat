package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Front3.front3;
import static codingbat.warmup1.IcyHot.icyHot;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class IcyHotTests {

    @Test
    public void shouldReturnIcyHot() {
        assertThat(icyHot(120, -1), is(equalTo(true)));
        assertThat(icyHot(-1, 120), is(equalTo(true)));
        assertThat(icyHot(2, 120), is(equalTo(false)));
    }
}