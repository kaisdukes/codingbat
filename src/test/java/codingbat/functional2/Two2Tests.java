package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.Two2.two2;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Two2Tests {

    @Test
    public void shouldReturnTwo2() {
        assertThat(two2(List.of(1, 2, 3)), is(equalTo(List.of(4, 6))));
        assertThat(two2(List.of(2, 6, 11)), is(equalTo(List.of(4))));
        assertThat(two2(List.of(0)), is(equalTo(List.of(0))));
        assertThat(two2(emptyList()), is(equalTo(emptyList())));
    }
}