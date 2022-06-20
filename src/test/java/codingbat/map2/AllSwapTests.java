package codingbat.map2;

import org.junit.Test;

import static codingbat.map2.AllSwap.allSwap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AllSwapTests {

    @Test
    public void shouldReturnAllSwap() {
        assertThat(
                allSwap(new String[]{"ab", "ac"}),
                is(equalTo(new String[]{"ac", "ab"})));

        assertThat(
                allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}),
                is(equalTo(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"})));

        assertThat(
                allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}),
                is(equalTo(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"})));
    }
}