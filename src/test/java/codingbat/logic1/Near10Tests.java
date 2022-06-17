package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.Near10.near10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Near10Tests {

    @Test
    public void shouldReturnNear10() {
        assertThat(near10(12), is(equalTo(true)));
        assertThat(near10(17), is(equalTo(false)));
        assertThat(near10(19), is(equalTo(true)));
    }
}