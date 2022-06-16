package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Double23.double23;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Double23Tests {

    @Test
    public void shouldReturnDouble23() {
        assertThat(double23(new int[]{2, 2}), is(equalTo(true)));
        assertThat(double23(new int[]{3, 3}), is(equalTo(true)));
        assertThat(double23(new int[]{2, 3}), is(equalTo(false)));
    }
}