package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Factorial.factorial;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTests {

    @Test
    public void shouldReturnFactorial() {
        assertThat(factorial(1), is(equalTo(1)));
        assertThat(factorial(2), is(equalTo(2)));
        assertThat(factorial(3), is(equalTo(6)));
    }
}