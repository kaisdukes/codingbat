package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.FrontAgain.frontAgain;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FrontAgainTests {

    @Test
    public void shouldReturnFrontAgain() {
        assertThat(frontAgain("edited"), is(equalTo(true)));
        assertThat(frontAgain("edit"), is(equalTo(false)));
        assertThat(frontAgain("ed"), is(equalTo(true)));
    }
}