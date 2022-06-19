package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.ParenBit.parenBit;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ParenBitTests {

    @Test
    public void shouldReturnParenBit() {
        assertThat(parenBit("xyz(abc)123"), is(equalTo("(abc)")));
        assertThat(parenBit("x(hello)"), is(equalTo("(hello)")));
        assertThat(parenBit("(xy)1"), is(equalTo("(xy)")));
    }
}