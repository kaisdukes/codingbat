package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.FizzString2.fizzString2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FizzString2Tests {

    @Test
    public void shouldReturnFizzString2() {
        assertThat(fizzString2(1), is(equalTo("1!")));
        assertThat(fizzString2(2), is(equalTo("2!")));
        assertThat(fizzString2(3), is(equalTo("Fizz!")));
        assertThat(fizzString2(5), is(equalTo("Buzz!")));
        assertThat(fizzString2(15), is(equalTo("FizzBuzz!")));
    }
}