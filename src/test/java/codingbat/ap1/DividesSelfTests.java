package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.DividesSelf.dividesSelf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DividesSelfTests {

    @Test
    public void shouldReturnDividesSelf() {
        assertThat(dividesSelf(128), is(equalTo(true)));
        assertThat(dividesSelf(12), is(equalTo(true)));
        assertThat(dividesSelf(120), is(equalTo(false)));
        assertThat(dividesSelf(32), is(equalTo(false)));
    }
}