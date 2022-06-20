package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.Copies3.copies3;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Copies3Tests {

    @Test
    public void shouldReturnCopies3() {
        assertThat(copies3(List.of("a", "bb", "ccc")), is(equalTo(List.of("aaa", "bbbbbb", "ccccccccc"))));
        assertThat(copies3(List.of("24", "a", "")), is(equalTo(List.of("242424", "aaa", ""))));
        assertThat(copies3(List.of("hello", "there")), is(equalTo(List.of("hellohellohello", "theretherethere"))));
        assertThat(copies3(emptyList()), is(equalTo(emptyList())));
    }
}