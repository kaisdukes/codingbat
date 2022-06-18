package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.ModThree.modThree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ModThreeTests {

    @Test
    public void shouldReturnModThree() {
        assertThat(modThree(new int[]{2, 1, 3, 5}), is(equalTo(true)));
        assertThat(modThree(new int[]{2, 1, 2, 5}), is(equalTo(false)));
        assertThat(modThree(new int[]{2, 4, 2, 5}), is(equalTo(true)));
    }
}