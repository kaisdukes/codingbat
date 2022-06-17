package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.ShareDigit.shareDigit;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ShareDigitTests {

    @Test
    public void shouldReturnShareDigit() {
        assertThat(shareDigit(12, 23), is(equalTo(true)));
        assertThat(shareDigit(12, 43), is(equalTo(false)));
        assertThat(shareDigit(12, 44), is(equalTo(false)));
    }
}