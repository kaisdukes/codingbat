package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.Front3.front3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Front3Tests {

    @Test
    public void shouldReturnFront3() {
        assertThat(front3("Java"), is(equalTo("JavJavJav")));
        assertThat(front3("Chocolate"), is(equalTo("ChoChoCho")));
        assertThat(front3("abc"), is(equalTo("abcabcabc")));
        assertThat(front3("ab"), is(equalTo("ababab")));
        assertThat(front3("a"), is(equalTo("aaa")));
        assertThat(front3(""), is(equalTo("")));
    }
}