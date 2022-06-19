package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.ChangePi.changePi;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ChangePiTests {

    @Test
    public void shouldChangePi() {
        assertThat(changePi("xpix"), is(equalTo("x3.14x")));
        assertThat(changePi("pipi"), is(equalTo("3.143.14")));
        assertThat(changePi("pip"), is(equalTo("3.14p")));
    }
}