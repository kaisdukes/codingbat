package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.AtFirst.atFirst;
import static codingbat.string1.MinCat.minCat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinCatTests {

    @Test
    public void shouldReturnMinCat() {
        assertThat(minCat("Hello", "Hi"), is(equalTo("loHi")));
        assertThat(minCat("Hello", "java"), is(equalTo("ellojava")));
        assertThat(minCat("java", "Hello"), is(equalTo("javaello")));
        assertThat(minCat("abc", "x"), is(equalTo("cx")));
        assertThat(minCat("x", "abc"), is(equalTo("xc")));
        assertThat(minCat("abc", ""), is(equalTo("")));
    }
}