package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.FizzBuzz.fizzBuzz;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTests {

    @Test
    public void shouldReturnFizzBuzz() {
        assertThat(fizzBuzz(1, 6), is(equalTo(
                new String[]{"1", "2", "Fizz", "4", "Buzz"})));

        assertThat(fizzBuzz(1, 8), is(equalTo(
                new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"})));

        assertThat(fizzBuzz(1, 11), is(equalTo(
                new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"})));
    }
}