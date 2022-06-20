package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.Square56.square56;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Square56Tests {

    @Test
    public void shouldReturnSquare56() {
        assertThat(square56(List.of(3, 1, 4)), is(equalTo(List.of(19, 11))));
        assertThat(square56(List.of(1)), is(equalTo(List.of(11))));
        assertThat(square56(List.of(2)), is(equalTo(List.of(14))));
        assertThat(square56(emptyList()), is(equalTo(emptyList())));
    }
}