package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.No9.no9;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class No9Tests {

    @Test
    public void shouldReturnNo9() {
        assertThat(no9(List.of(1, 2, 19)), is(equalTo(List.of(1, 2))));
        assertThat(no9(List.of(9, 19, 29, 3)), is(equalTo(List.of(3))));
        assertThat(no9(List.of(1, 2, 3)), is(equalTo(List.of(1, 2, 3))));
        assertThat(no9(emptyList()), is(equalTo(emptyList())));
    }
}