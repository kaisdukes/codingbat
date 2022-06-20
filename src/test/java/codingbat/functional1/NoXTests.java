package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.NoX.noX;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoXTests {

    @Test
    public void shouldReturnNoX() {
        assertThat(noX(List.of("ax", "bb", "cx")), is(equalTo(List.of("a", "bb", "c"))));
        assertThat(noX(List.of("xxax", "xbxbx", "xxcx")), is(equalTo(List.of("a", "bb", "c"))));
        assertThat(noX(List.of("x")), is(equalTo(List.of(""))));
        assertThat(noX(emptyList()), is(equalTo(emptyList())));
    }
}