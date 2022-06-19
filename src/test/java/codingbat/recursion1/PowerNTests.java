package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.PowerN.powerN;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PowerNTests {

    @Test
    public void shouldReturnPowerN() {
        assertThat(powerN(3, 0), is(equalTo(1)));
        assertThat(powerN(3, 1), is(equalTo(3)));
        assertThat(powerN(3, 2), is(equalTo(9)));
        assertThat(powerN(3, 3), is(equalTo(27)));
    }
}