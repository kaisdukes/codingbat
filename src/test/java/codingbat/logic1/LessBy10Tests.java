package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.LessBy10.lessBy10;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LessBy10Tests {

    @Test
    public void shouldReturnLessBy10() {
        assertThat(lessBy10(1, 7, 11), is(equalTo(true)));
        assertThat(lessBy10(1, 7, 10), is(equalTo(false)));
        assertThat(lessBy10(11, 1, 7), is(equalTo(true)));
    }
}