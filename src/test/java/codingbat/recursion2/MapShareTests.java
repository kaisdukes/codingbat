package codingbat.recursion2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapShare.mapShare;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapShareTests {

    @Test
    public void shouldReturnMapShare() {
        assertThat(
                mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))),
                is(equalTo(Map.of("a", "aaa", "b", "aaa"))));

        assertThat(
                mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))),
                is(equalTo(Map.of("b", "xyz"))));

        assertThat(
                mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"))),
                is(equalTo(Map.of("a", "aaa", "b", "aaa", "d", "hi"))));
    }
}