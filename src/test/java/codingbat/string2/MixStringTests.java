package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.MixString.mixString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MixStringTests {

    @Test
    public void shouldReturnMixString() {
        assertThat(mixString("abc", "xyz"), is(equalTo("axbycz")));
        assertThat(mixString("Hi", "There"), is(equalTo("HTihere")));
        assertThat(mixString("xxxx", "There"), is(equalTo("xTxhxexre")));
    }
}