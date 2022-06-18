package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.TripleUp.tripleUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TripleUpTests {

    @Test
    public void shouldReturnTripleUp() {
        assertThat(tripleUp(new int[]{1, 4, 5, 6, 2}), is(equalTo(true)));
        assertThat(tripleUp(new int[]{1, 2, 3}), is(equalTo(true)));
        assertThat(tripleUp(new int[]{1, 2, 4}), is(equalTo(false)));
    }
}