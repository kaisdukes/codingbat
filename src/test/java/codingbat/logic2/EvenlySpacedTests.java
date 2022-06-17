package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.EvenlySpaced.evenlySpaced;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EvenlySpacedTests {

    @Test
    public void shouldReturnEvenlySpaced() {
        assertThat(evenlySpaced(2, 4, 6), is(equalTo(true)));
        assertThat(evenlySpaced(4, 6, 2), is(equalTo(true)));
        assertThat(evenlySpaced(4, 6, 3), is(equalTo(false)));
    }
}