package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapAB3.mapAB3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapAB3Tests {

    @Test
    public void shouldReturnMapAB3() {
        assertThat(
                mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake"))),
                is(equalTo(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));

        assertThat(
                mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake"))),
                is(equalTo(Map.of("a", "bbb", "b", "bbb", "c", "cake"))));

        assertThat(
                mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))),
                is(equalTo(Map.of("a", "aaa", "b", "bbb", "c", "cake"))));
    }
}