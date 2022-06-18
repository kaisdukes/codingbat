package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.EndOther.endOther;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndOtherTests {

    @Test
    public void shouldReturnEndOther() {
        assertThat(endOther("Hiabc", "abc"), is(equalTo(true)));
        assertThat(endOther("AbC", "HiaBc"), is(equalTo(true)));
        assertThat(endOther("abc", "abXabc"), is(equalTo(true)));
        assertThat(endOther("yz", "12xz"), is(equalTo(false)));
    }
}