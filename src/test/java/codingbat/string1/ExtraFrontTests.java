package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.ExtraFront.extraFront;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ExtraFrontTests {

    @Test
    public void shouldReturnExtraFront() {
        assertThat(extraFront("Hello"), is(equalTo("HeHeHe")));
        assertThat(extraFront("ab"), is(equalTo("ababab")));
        assertThat(extraFront("H"), is(equalTo("HHH")));
        assertThat(extraFront(""), is(equalTo("")));
        assertThat(extraFront("Candy"), is(equalTo("CaCaCa")));
        assertThat(extraFront("Code"), is(equalTo("CoCoCo")));
    }
}