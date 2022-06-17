package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.MaxMod5.maxMod5;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxMod5Tests {

    @Test
    public void shouldReturnMaxMod5() {
        assertThat(maxMod5(2, 3), is(equalTo(3)));
        assertThat(maxMod5(6, 2), is(equalTo(6)));
        assertThat(maxMod5(3, 2), is(equalTo(3)));
        assertThat(maxMod5(7, 7), is(equalTo(0)));
    }
}