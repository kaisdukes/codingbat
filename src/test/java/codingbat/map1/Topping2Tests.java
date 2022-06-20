package codingbat.map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static codingbat.map1.Topping2.topping2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Topping2Tests {

    @Test
    public void shouldReturnTopping2() {
        assertThat(
                topping2(new HashMap<>(Map.of("ice cream", "cherry"))),
                is(equalTo(Map.of("yogurt", "cherry", "ice cream", "cherry"))));

        assertThat(
                topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))),
                is(equalTo(Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"))));

        assertThat(
                topping2(new HashMap<>(Map.of("yogurt", "salt"))),
                is(equalTo(Map.of("yogurt", "salt"))));
    }
}