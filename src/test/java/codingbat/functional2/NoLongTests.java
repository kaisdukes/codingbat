package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.NoLong.noLong;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoLongTests {

    @Test
    public void shouldReturnNoLong() {
        assertThat(noLong(List.of("this", "not", "too", "long")), is(equalTo(List.of("not", "too"))));
        assertThat(noLong(List.of("a", "bbb", "cccc")), is(equalTo(List.of("a", "bbb"))));
        assertThat(noLong(List.of("cccc", "cccc", "cccc")), is(equalTo(emptyList())));
        assertThat(noLong(emptyList()), is(equalTo(emptyList())));
    }
}