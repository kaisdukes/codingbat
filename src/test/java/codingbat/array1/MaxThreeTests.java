package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.MaxThree.maxThree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxThreeTests {

    @Test
    public void shouldReturnMaxThree() {
        assertThat(maxThree(new int[]{1, 2, 3}), is(equalTo(3)));
        assertThat(maxThree(new int[]{1, 2, 3}), is(equalTo(5)));
        assertThat(maxThree(new int[]{5, 2, 3}), is(equalTo(5)));
    }
}