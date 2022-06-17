package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.TwoAsOne.twoAsOne;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TwoAsOneTests {

    @Test
    public void shouldReturnTwoAsOne() {
        assertThat(twoAsOne(1, 2, 3), is(equalTo(true)));
        assertThat(twoAsOne(3, 1, 2), is(equalTo(true)));
        assertThat(twoAsOne(3, 2, 2), is(equalTo(false)));
    }
}