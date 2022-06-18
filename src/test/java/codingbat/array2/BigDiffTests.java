package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.BigDiff.bigDiff;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BigDiffTests {

    @Test
    public void shouldReturnBigDiff() {
        assertThat(bigDiff(new int[]{10, 3, 5, 6}), is(equalTo(7)));
        assertThat(bigDiff(new int[]{7, 2, 10, 9}), is(equalTo(8)));
        assertThat(bigDiff(new int[]{2, 10, 7, 2}), is(equalTo(8)));
    }
}