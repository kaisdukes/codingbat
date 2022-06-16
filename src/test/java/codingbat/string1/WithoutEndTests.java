package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.WithoutEnd.withoutEnd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithoutEndTests {

    @Test
    public void shouldReturnWithoutEnd() {
        assertThat(withoutEnd("Hello"), is(equalTo("ell")));
        assertThat(withoutEnd("java"), is(equalTo("av")));
        assertThat(withoutEnd("coding"), is(equalTo("odin")));
    }
}