package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.NoTeen.noTeen;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoTeenTests {

    @Test
    public void shouldReturnNoTeen() {
        assertThat(noTeen(List.of(12, 13, 19, 20)), is(equalTo(List.of(12, 20))));
        assertThat(noTeen(List.of(1, 14, 1)), is(equalTo(List.of(1, 1))));
        assertThat(noTeen(List.of(15)), is(equalTo(emptyList())));
        assertThat(noTeen(emptyList()), is(equalTo(emptyList())));
    }
}