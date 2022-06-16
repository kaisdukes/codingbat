package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.MiddleThree.middleThree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MiddleThreeTests {

    @Test
    public void shouldReturnMiddleThree() {
        assertThat(middleThree("Candy"), is(equalTo("and")));
        assertThat(middleThree("and"), is(equalTo("and")));
        assertThat(middleThree("solving"), is(equalTo("lvi")));
    }
}