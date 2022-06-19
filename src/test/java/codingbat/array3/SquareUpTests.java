package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.SquareUp.squareUp;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquareUpTests {

    @Test
    public void shouldReturnSquareUp() {
        assertThat(squareUp(3), is(equalTo(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1})));
        assertThat(squareUp(2), is(equalTo(new int[]{0, 1, 2, 1})));
        assertThat(squareUp(4), is(equalTo(new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1})));
    }
}