package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.Pairs.pairs;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PairsTests {

    @Test
    public void shouldReturnPairs() {
        assertThat(
                pairs(new String[]{"code", "bug"}),
                is(equalTo(Map.of("b", "g", "c", "e"))));

        assertThat(
                pairs(new String[]{"man", "moon", "main"}),
                is(equalTo(Map.of("m", "n"))));

        assertThat(
                pairs(new String[]{"man", "moon", "good", "night"}),
                is(equalTo(Map.of("g", "d", "m", "n", "n", "t"))));
    }
}