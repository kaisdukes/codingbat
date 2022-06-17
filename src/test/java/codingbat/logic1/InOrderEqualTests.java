package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.InOrderEqual.inOrderEqual;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class InOrderEqualTests {

    @Test
    public void shouldReturnInOrderEqual() {
        assertThat(inOrderEqual(2, 5, 11, false), is(equalTo(true)));
        assertThat(inOrderEqual(5, 7, 6, false), is(equalTo(false)));
        assertThat(inOrderEqual(5, 5, 7, true), is(equalTo(true)));
    }
}