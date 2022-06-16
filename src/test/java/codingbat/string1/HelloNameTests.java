package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.HelloName.helloName;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HelloNameTests {

    @Test
    public void shouldReturnHelloName() {
        assertThat(helloName("Bob"), is(equalTo("Hello Bob!")));
        assertThat(helloName("Alice"), is(equalTo("Hello Alice!")));
        assertThat(helloName("X"), is(equalTo("Hello X!")));
    }
}