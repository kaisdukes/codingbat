package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.Square.square;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquareTests {

    @Test
    public void shouldReturnSquare() {
        assertThat(square(List.of(1, 2, 3)), is(equalTo(List.of(1, 4, 9))));
        assertThat(square(List.of(6, 8, -6, -8, 1)), is(equalTo(List.of(36, 64, 36, 64, 1))));
        assertThat(square(emptyList()), is(equalTo(emptyList())));
    }
}