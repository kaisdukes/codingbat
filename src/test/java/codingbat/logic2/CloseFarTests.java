package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.CloseFar.closeFar;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CloseFarTests {

    @Test
    public void shouldReturnCloseFar() {
        assertThat(closeFar(1, 2, 10), is(equalTo(true)));
        assertThat(closeFar(1, 2, 3), is(equalTo(false)));
        assertThat(closeFar(4, 1, 3), is(equalTo(true)));
    }
}