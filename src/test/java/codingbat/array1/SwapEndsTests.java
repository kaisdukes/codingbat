package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.SwapEnds.swapEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwapEndsTests {

    @Test
    public void shouldSwapEnds() {
        assertThat(swapEnds(new int[]{1, 2, 3, 4}), is(equalTo(new int[]{4, 2, 3, 1})));
        assertThat(swapEnds(new int[]{1, 2, 3}), is(equalTo(new int[]{3, 2, 1})));
        assertThat(swapEnds(new int[]{8, 6, 7, 9, 5}), is(equalTo(new int[]{5, 6, 7, 9, 8})));
    }
}