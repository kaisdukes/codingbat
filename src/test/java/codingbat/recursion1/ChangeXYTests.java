package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.ChangeXY.changeXY;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ChangeXYTests {

    @Test
    public void shouldChangeXY() {
        assertThat(changeXY("codex"), is(equalTo("codey")));
        assertThat(changeXY("xxhixx"), is(equalTo("yyhiyy")));
        assertThat(changeXY("xhixhix"), is(equalTo("yhiyhiy")));
    }
}