package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.Topping3.topping3;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Topping3Tests {

    @Test
    public void shouldReturnTopping3() {
        assertThat(
                topping3(new HashMap<>(Map.of("potato", "ketchup"))),
                is(equalTo(Map.of("potato", "ketchup", "fries", "ketchup"))));

        assertThat(
                topping3(new HashMap<>(Map.of("potato", "butter"))),
                is(equalTo(Map.of("potato", "butter", "fries", "butter"))));

        assertThat(
                topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))),
                is(equalTo(Map.of(
                        "spinach", "oil",
                        "salad", "oil",
                        "potato", "ketchup",
                        "fries", "ketchup"))));
    }
}