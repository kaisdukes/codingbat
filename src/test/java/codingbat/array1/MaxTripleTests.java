package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MaxTriple.maxTriple;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxTripleTests {

    @Test
    public void shouldReturnMaxTriple() {
        assertThat(maxTriple(new int[]{1, 2, 3}), is(equalTo(3)));
        assertThat(maxTriple(new int[]{1, 5, 3}), is(equalTo(5)));
        assertThat(maxTriple(new int[]{5, 2, 3}), is(equalTo(5)));
    }
}