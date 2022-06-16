package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MakeEnds.makeEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeEndsTests {

    @Test
    public void shouldMakeEnds() {
        assertThat(makeEnds(new int[]{1, 2, 3}), is(equalTo(new int[]{1, 3})));
        assertThat(makeEnds(new int[]{1, 2, 3, 4}), is(equalTo(new int[]{1, 4})));
        assertThat(makeEnds(new int[]{7, 4, 6, 2}), is(equalTo(new int[]{7, 2})));
    }
}