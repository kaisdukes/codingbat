package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.NoYY.noYY;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoYYTests {

    @Test
    public void shouldReturnNoYY() {
        assertThat(noYY(List.of("a", "b", "c")), is(equalTo(List.of("ay", "by", "cy"))));
        assertThat(noYY(List.of("a", "b", "cy")), is(equalTo(List.of("ay", "by"))));
        assertThat(noYY(List.of("xx", "ya", "zz")), is(equalTo(List.of("xxy", "yay", "zzy"))));
        assertThat(noYY(emptyList()), is(equalTo(emptyList())));
    }
}