package codingbat.map2;

import org.junit.Test;

import static codingbat.map2.FirstSwap.firstSwap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FirstSwapTests {

    @Test
    public void shouldReturnFirstSwap() {
        assertThat(
                firstSwap(new String[]{"ab", "ac"}),
                is(equalTo(new String[]{"ac", "ab"})));

        assertThat(
                firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}),
                is(equalTo(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"})));

        assertThat(
                firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}),
                is(equalTo(new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"})));
    }
}