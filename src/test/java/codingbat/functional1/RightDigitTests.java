package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.RightDigit.rightDigit;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RightDigitTests {

    @Test
    public void shouldReturnRightDigit() {
        assertThat(rightDigit(List.of(1, 22, 93)), is(equalTo(List.of(1, 2, 3))));
        assertThat(rightDigit(List.of(16, 8, 886, 8, 1)), is(equalTo(List.of(6, 8, 6, 8, 1))));
        assertThat(rightDigit(List.of(10, 0)), is(equalTo(List.of(0, 0))));
        assertThat(rightDigit(emptyList()), is(equalTo(emptyList())));
    }
}