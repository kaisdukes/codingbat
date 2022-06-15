package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.StringSplosion.stringSplosion;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringSplosionTests {

    @Test
    public void shouldReturnStringSplosion() {
        assertThat(stringSplosion("Code"), is(equalTo("CCoCodCode")));
        assertThat(stringSplosion("abc"), is(equalTo("aababc")));
        assertThat(stringSplosion("ab"), is(equalTo("aab")));
    }
}