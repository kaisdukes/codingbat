package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.ZipZap.zipZap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ZipZapTests {

    @Test
    public void shouldReturnZipZap() {
        assertThat(zipZap("zipXzap"), is(equalTo("zpXzp")));
        assertThat(zipZap("zopzop"), is(equalTo("zpzp")));
        assertThat(zipZap("zzzopzop"), is(equalTo("zzzpzp")));
    }
}