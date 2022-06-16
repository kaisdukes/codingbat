package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.WithoutTwo.withoutTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Without2Tests {

    @Test
    public void shouldReturnWithout2() {
        assertThat(withoutTwo("HelloHe"), is(equalTo("lloHe")));
        assertThat(withoutTwo("HelloHi"), is(equalTo("HelloHi")));
        assertThat(withoutTwo("Hi"), is(equalTo("")));
    }
}