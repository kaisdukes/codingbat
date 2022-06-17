package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.SpecialEleven.specialEleven;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SpecialElevenTests {

    @Test
    public void shouldReturnSpecialEleven() {
        assertThat(specialEleven(22), is(equalTo(true)));
        assertThat(specialEleven(23), is(equalTo(true)));
        assertThat(specialEleven(24), is(equalTo(false)));
    }
}