package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.Topping1.topping1;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Topping1Tests {

    @Test
    public void shouldReturnTopping1() {
        assertThat(
                topping1(new HashMap<>(Map.of("ice cream", "peanuts"))),
                is(equalTo(Map.of("bread", "butter", "ice cream", "cherry"))));

        assertThat(
                topping1(new HashMap<>()),
                is(equalTo(Map.of("bread", "butter"))));

        assertThat(
                topping1(new HashMap<>(Map.of("pancake", "syrup"))),
                is(equalTo(Map.of("bread", "butter", "pancake", "syrup"))));
    }
}