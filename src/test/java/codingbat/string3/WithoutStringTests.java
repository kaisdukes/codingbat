package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.WithoutString.withoutString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithoutStringTests {

    @Test
    public void shouldReturnWithoutString() {
        assertThat(withoutString("Hello there", "llo"), is(equalTo("He there")));
        assertThat(withoutString("Hello there", "e"), is(equalTo("Hllo thr")));
        assertThat(withoutString("Hello there", "x"), is(equalTo("Hello there")));
    }
}