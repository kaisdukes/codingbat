package codingbat.map2;

import org.junit.Test;

import java.util.Map;

import static codingbat.map2.Word0.word0;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Word0Tests {

    @Test
    public void shouldReturnWord0() {
        assertThat(
                word0(new String[]{"a", "b", "a", "b"}),
                is(equalTo(Map.of("a", 0, "b", 0))));

        assertThat(
                word0(new String[]{"a", "b", "a", "c", "b"}),
                is(equalTo(Map.of("a", 0, "b", 0, "c", 0))));

        assertThat(
                word0(new String[]{"c", "b", "a"}),
                is(equalTo(Map.of("a", 0, "b", 0, "c", 0))));
    }
}