package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.Left2.left2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Left2Tests {

    @Test
    public void shouldReturnLeft2() {
        assertThat(left2("Hello"), is(equalTo("lloHe")));
        assertThat(left2("java"), is(equalTo("vaja")));
        assertThat(left2("Hi"), is(equalTo("Hi")));
    }
}