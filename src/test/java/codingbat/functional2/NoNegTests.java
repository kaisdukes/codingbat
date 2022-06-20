package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.NoNeg.noNeg;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoNegTests {

    @Test
    public void shouldReturnNoNeg() {
        assertThat(noNeg(List.of(1, -2)), is(equalTo(List.of(1))));
        assertThat(noNeg(List.of(-3, -3, 3, 3)), is(equalTo(List.of(3, 3))));
        assertThat(noNeg(List.of(-1, -1, -1)), is(equalTo(emptyList())));
        assertThat(noNeg(emptyList()), is(equalTo(emptyList())));
    }
}