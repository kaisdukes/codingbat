package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.NestParen.nestParen;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NestParenTests {

    @Test
    public void shouldReturnNestParen() {
        assertThat(nestParen("(())"), is(equalTo(true)));
        assertThat(nestParen("((()))"), is(equalTo(true)));
        assertThat(nestParen("(((x))"), is(equalTo(false)));
        assertThat(nestParen(""), is(equalTo(true)));
    }
}