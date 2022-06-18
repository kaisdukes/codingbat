package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.CountCode.countCode;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountCodeTests {

    @Test
    public void shouldCountCode() {
        assertThat(countCode("aaacodebbb"), is(equalTo(1)));
        assertThat(countCode("codexxcode"), is(equalTo(2)));
        assertThat(countCode("cozexxcope"), is(equalTo(2)));
    }
}