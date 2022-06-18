package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.NotReplace.notReplace;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NotReplaceTests {

    @Test
    public void shouldReturnNotReplace() {
        assertThat(notReplace("is test"), is(equalTo("is not test")));
        assertThat(notReplace("is-is"), is(equalTo("is not-is not")));
        assertThat(notReplace("This is right"), is(equalTo("This is not right")));
    }
}