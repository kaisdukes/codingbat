package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.Math1.math1;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Math1Tests {

    @Test
    public void shouldReturnMath1() {
        assertThat(math1(List.of(1, 2, 3)), is(equalTo(List.of(20, 30, 40))));
        assertThat(math1(List.of(6, 8, 6, 8, 1)), is(equalTo(List.of(70, 90, 70, 90, 20))));
        assertThat(math1(List.of(10)), is(equalTo(List.of(110))));
        assertThat(math1(emptyList()), is(equalTo(emptyList())));
    }
}