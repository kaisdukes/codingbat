package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.Less20.less20;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Less20Tests {

    @Test
    public void shouldReturnLess20() {
        assertThat(less20(18), is(equalTo(true)));
        assertThat(less20(19), is(equalTo(true)));
        assertThat(less20(20), is(equalTo(false)));
    }
}