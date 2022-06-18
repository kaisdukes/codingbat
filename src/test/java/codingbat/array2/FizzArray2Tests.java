package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.FizzArray2.fizzArray2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzArray2Tests {

    @Test
    public void shouldReturnFizzArray2() {
        assertThat(fizzArray2(4), is(equalTo(new String[]{"0", "1", "2", "3"})));
        assertThat(fizzArray2(10), is(equalTo(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"})));
        assertThat(fizzArray2(2), is(equalTo(new String[]{"0", "1"})));
    }
}