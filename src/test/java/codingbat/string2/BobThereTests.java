package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.BobThere.bobThere;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BobThereTests {

    @Test
    public void shouldReturnBobThere() {
        assertThat(bobThere("abcbob"), is(equalTo(true)));
        assertThat(bobThere("b9b"), is(equalTo(true)));
        assertThat(bobThere("bac"), is(equalTo(false)));
    }
}