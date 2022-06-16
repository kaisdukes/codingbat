package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.AtFirst.atFirst;
import static codingbat.string1.SeeColor.seeColor;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SeeColorTests {

    @Test
    public void shouldSeeColor() {
        assertThat(seeColor("redxx"), is(equalTo("red")));
        assertThat(seeColor("xxred"), is(equalTo("")));
        assertThat(seeColor("blueTimes"), is(equalTo("blue")));
    }
}