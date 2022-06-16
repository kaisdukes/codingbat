package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Fix23.fix23;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Fix23Tests {

    @Test
    public void shouldFix23() {
        assertThat(fix23(new int[]{1, 2, 3}), is(equalTo(new int[]{1, 2, 0})));
        assertThat(fix23(new int[]{2, 3, 5}), is(equalTo(new int[]{2, 0, 5})));
        assertThat(fix23(new int[]{1, 2, 1}), is(equalTo(new int[]{1, 2, 1})));
    }
}