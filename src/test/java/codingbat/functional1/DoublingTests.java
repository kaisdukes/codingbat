package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.Doubling.doubling;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DoublingTests {

    @Test
    public void shouldReturnDoubling() {
        assertThat(doubling(List.of(1, 2, 3)), is(equalTo(List.of(2, 4, 6))));
        assertThat(doubling(List.of(6, 8, 6, 8, -1)), is(equalTo(List.of(12, 16, 12, 16, -2))));
        assertThat(doubling(emptyList()), is(equalTo(emptyList())));
    }
}