package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.MapBully.mapBully;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MapBullyTests {

    @Test
    public void shouldReturnMapBully() {
        assertThat(
                mapBully(new HashMap<>(Map.of("a", "candy", "b", "dirt"))),
                is(equalTo(Map.of("a", "", "b", "candy"))));

        assertThat(
                mapBully(new HashMap<>(Map.of("a", "candy"))),
                is(equalTo(Map.of("a", "", "b", "candy"))));

        assertThat(
                mapBully(new HashMap<>(Map.of("a", "candy", "b", "carry", "c", "meh"))),
                is(equalTo(Map.of("a", "", "b", "candy", "c", "meh"))));
    }
}