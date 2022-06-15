package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.CountXX.countXX;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountXXTests {

    @Test
    public void shouldReturnCountXX() {
        assertThat(countXX(""), is(equalTo(0)));
        assertThat(countXX("a"), is(equalTo(0)));
        assertThat(countXX("ab"), is(equalTo(0)));
        assertThat(countXX("abc"), is(equalTo(0)));
        assertThat(countXX("abcxx"), is(equalTo(1)));
        assertThat(countXX("xxx"), is(equalTo(2)));
        assertThat(countXX("xxxx"), is(equalTo(3)));
    }
}