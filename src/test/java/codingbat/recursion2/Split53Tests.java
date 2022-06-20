package codingbat.recursion2;

import org.junit.Test;

import static codingbat.recursion2.Split53.split53;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Split53Tests {

    @Test
    public void shouldSplit53() {
        assertThat(split53(new int[]{1, 1}), is(equalTo(true)));
        assertThat(split53(new int[]{1, 1, 1}), is(equalTo(false)));
        assertThat(split53(new int[]{2, 4, 2}), is(equalTo(true)));
        assertThat(split53(new int[]{3, 5, 6, 10, 3, 3}), is(equalTo(true)));
    }
}