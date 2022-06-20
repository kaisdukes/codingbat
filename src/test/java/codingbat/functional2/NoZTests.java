package codingbat.functional2;

import org.junit.Test;

import java.util.List;

import static codingbat.functional2.NoZ.noZ;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoZTests {

    @Test
    public void shouldReturnNoZ() {
        assertThat(noZ(List.of("aaa", "bbb", "aza")), is(equalTo(List.of("aaa", "bbb"))));
        assertThat(noZ(List.of("hziz", "hzello", "hi")), is(equalTo(List.of("hi"))));
        assertThat(noZ(List.of("hello", "howz", "are", "youz")), is(equalTo(List.of("hello", "are"))));
        assertThat(noZ(emptyList()), is(equalTo(emptyList())));
    }
}