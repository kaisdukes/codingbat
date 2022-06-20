package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.No34.no34;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class No34Tests {

    @Test
    public void shouldReturnNo34() {
        assertThat(no34(List.of("a", "bb", "ccc")), is(equalTo(List.of("a", "bb"))));
        assertThat(no34(List.of("a", "bb", "ccc", "dddd")), is(equalTo(List.of("a", "bb"))));
        assertThat(no34(List.of("ccc", "dddd", "apple")), is(equalTo(List.of("apple"))));
        assertThat(no34(emptyList()), is(equalTo(emptyList())));
    }
}