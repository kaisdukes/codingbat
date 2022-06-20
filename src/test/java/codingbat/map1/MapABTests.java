package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapAB.mapAB;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapABTests {

    @Test
    public void shouldReturnMapAB() {
        assertThat(
                mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))),
                is(equalTo(Map.of("a", "Hi", "ab", "HiThere", "b", "There"))));

        assertThat(
                mapAB(new HashMap<>(Map.of("a", "Hi"))),
                is(equalTo(Map.of("a", "Hi"))));

        assertThat(
                mapAB(new HashMap<>(Map.of("b", "There"))),
                is(equalTo(Map.of("b", "There"))));
    }
}