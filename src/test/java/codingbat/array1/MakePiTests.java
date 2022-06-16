package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MakePi.makePi;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakePiTests {

    @Test
    public void shouldMakePi() {
        assertThat(makePi(), is(equalTo(new int[]{3, 1, 4})));
    }
}