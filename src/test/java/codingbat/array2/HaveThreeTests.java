package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.HaveThree.haveThree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HaveThreeTests {

    @Test
    public void shouldReturnHaveThree() {
        assertThat(haveThree(new int[]{3, 1, 3, 1, 3}), is(equalTo(true)));
        assertThat(haveThree(new int[]{3, 1, 3, 3}), is(equalTo(false)));
        assertThat(haveThree(new int[]{3, 4, 3, 3, 4}), is(equalTo(false)));
    }
}