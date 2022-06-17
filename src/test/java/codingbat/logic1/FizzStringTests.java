package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.FizzString.fizzString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzStringTests {

    @Test
    public void shouldReturnFizzString() {
        assertThat(fizzString("fig"), is(equalTo("Fizz")));
        assertThat(fizzString("dib"), is(equalTo("Buzz")));
        assertThat(fizzString("fib"), is(equalTo("FizzBuzz")));
        assertThat(fizzString("bf"), is(equalTo("bf")));
    }
}