package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.Right2.right2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Right2Tests {

    @Test
    public void shouldReturnRight2() {
        assertThat(right2("Hello"), is(equalTo("loHel")));
        assertThat(right2("java"), is(equalTo("vaja")));
        assertThat(right2("Hi"), is(equalTo("Hi")));
    }
}