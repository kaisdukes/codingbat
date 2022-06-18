package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.XyBalance.xyBalance;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class XyBalanceTests {

    @Test
    public void shouldReturnXyBalance() {
        assertThat(xyBalance("aaxbby"), is(equalTo(true)));
        assertThat(xyBalance("aaxbb"), is(equalTo(false)));
        assertThat(xyBalance("yaaxbb"), is(equalTo(false)));
    }
}