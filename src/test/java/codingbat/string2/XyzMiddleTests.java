package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.XyzMiddle.xyzMiddle;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class XyzMiddleTests {

    @Test
    public void shouldReturnXyzMiddle() {
        assertThat(xyzMiddle("AAxyzBB"), is(equalTo(true)));
        assertThat(xyzMiddle("AxyzBB"), is(equalTo(true)));
        assertThat(xyzMiddle("AxyzBBB"), is(equalTo(false)));
    }
}