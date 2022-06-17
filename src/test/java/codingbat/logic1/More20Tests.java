package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.More20.more20;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class More20Tests {

    @Test
    public void shouldReturnMore20() {
        assertThat(more20(20), is(equalTo(false)));
        assertThat(more20(21), is(equalTo(true)));
        assertThat(more20(22), is(equalTo(true)));
    }
}