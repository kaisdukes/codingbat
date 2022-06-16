package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.ExtraEnd.extraEnd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ExtraEndTests {

    @Test
    public void shouldReturnExtraEnd() {
        assertThat(extraEnd("Hello"), is(equalTo("lololo")));
        assertThat(extraEnd("ab"), is(equalTo("ababab")));
        assertThat(extraEnd("Hi"), is(equalTo("HiHiHi")));
    }
}