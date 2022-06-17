package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.MakeBricks.makeBricks;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeBricksTests {

    @Test
    public void shouldMakeBricks() {
        assertThat(makeBricks(3, 1, 8), is(equalTo(true)));
        assertThat(makeBricks(3, 1, 9), is(equalTo(false)));
        assertThat(makeBricks(3, 2, 10), is(equalTo(true)));
    }
}