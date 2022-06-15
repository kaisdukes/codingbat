package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.DelDel.delDel;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DelDelTests {

    @Test
    public void shouldDeleteDel() {
        assertThat(delDel("adelbc"), is(equalTo("abc")));
        assertThat(delDel("adelHello"), is(equalTo("aHello")));
        assertThat(delDel("adedbc"), is(equalTo("adedbc")));
        assertThat(delDel("adel"), is(equalTo("a")));
        assertThat(delDel("abc"), is(equalTo("abc")));
        assertThat(delDel("ab"), is(equalTo("ab")));
        assertThat(delDel("a"), is(equalTo("a")));
        assertThat(delDel(""), is(equalTo("")));
    }
}