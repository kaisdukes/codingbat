package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.TwoTwo.twoTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TwoTwoTests {

    @Test
    public void shouldReturnTwoTwo() {
        assertThat(twoTwo(new int[]{4, 2, 2, 3}), is(equalTo(true)));
        assertThat(twoTwo(new int[]{2, 2, 4}), is(equalTo(true)));
        assertThat(twoTwo(new int[]{2, 2, 4, 2}), is(equalTo(false)));
    }
}