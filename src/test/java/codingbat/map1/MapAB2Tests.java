package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapAB2.mapAB2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapAB2Tests {

    @Test
    public void shouldReturnMapAB2() {
        assertThat(
                mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))),
                is(equalTo(Map.of("c", "cake"))));

        assertThat(
                mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))),
                is(equalTo(Map.of("a", "aaa", "b", "bbb"))));

        assertThat(
                mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))),
                is(equalTo(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));
    }
}