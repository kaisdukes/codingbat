package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Fibonacci.fibonacci;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTests {

    @Test
    public void shouldReturnFibonacci() {
        assertThat(fibonacci(0), is(equalTo(0)));
        assertThat(fibonacci(1), is(equalTo(1)));
        assertThat(fibonacci(2), is(equalTo(1)));
        assertThat(fibonacci(3), is(equalTo(2)));
        assertThat(fibonacci(4), is(equalTo(3)));
        assertThat(fibonacci(5), is(equalTo(5)));
        assertThat(fibonacci(6), is(equalTo(8)));
        assertThat(fibonacci(7), is(equalTo(13)));
    }
}