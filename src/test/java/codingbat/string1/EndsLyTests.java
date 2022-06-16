package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.EndsLy.endsLy;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndsLyTests {

    @Test
    public void shouldReturnEndsLy() {
        assertThat(endsLy("oddly"), is(equalTo(true)));
        assertThat(endsLy("y"), is(equalTo(false)));
        assertThat(endsLy("oddy"), is(equalTo(false)));
    }
}