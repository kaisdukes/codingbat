package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.CommonTwo.commonTwo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CommonTwoTests {

    @Test
    public void shouldReturnCommonTwo() {
        assertThat(
                commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}),
                is(equalTo(2)));

        assertThat(
                commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}),
                is(equalTo(3)));

        assertThat(
                commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}),
                is(equalTo(3)));

        assertThat(
                commonTwo(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}),
                is(equalTo(2)));
    }
}