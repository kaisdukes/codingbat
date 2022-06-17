package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.Love6.love6;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Love6Tests {

    @Test
    public void shouldReturnLove6() {
        assertThat(love6(6, 4), is(equalTo(true)));
        assertThat(love6(4, 5), is(equalTo(false)));
        assertThat(love6(1, 5), is(equalTo(true)));
    }
}