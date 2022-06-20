package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapAB4.mapAB4;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapAB4Tests {

    @Test
    public void shouldReturnMapAB4() {
        assertThat(
                mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))),
                is(equalTo(Map.of("a", "aaa", "b", "bb", "c", "aaa"))));

        assertThat(
                mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))),
                is(equalTo(Map.of("a", "aa", "b", "bbb", "c", "bbb"))));

        assertThat(
                mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))),
                is(equalTo(Map.of("a", "aa", "b", "bbb", "c", "bbb"))));

        assertThat(
                mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))),
                is(equalTo(Map.of("a", "", "b", "", "c", "cake"))));
    }
}