package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.MergeTwo.mergeTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MergeTwoTests {

    @Test
    public void shouldMergeTwo() {
        assertThat(
                mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3),
                is(equalTo(new String[]{"a", "b", "c"})));

        assertThat(
                mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3),
                is(equalTo(new String[]{"a", "c", "f"})));

        assertThat(
                mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3),
                is(equalTo(new String[]{"c", "f", "g"})));
    }
}