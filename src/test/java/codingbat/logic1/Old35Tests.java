package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.Old35.old35;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Old35Tests {

    @Test
    public void shouldReturnOld35() {
        assertThat(old35(3), is(equalTo(true)));
        assertThat(old35(10), is(equalTo(true)));
        assertThat(old35(15), is(equalTo(false)));
    }
}