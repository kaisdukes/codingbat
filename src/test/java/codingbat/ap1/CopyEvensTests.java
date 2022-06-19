package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.CopyEvens.copyEvens;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CopyEvensTests {

    @Test
    public void shouldCopyEvens() {
        assertThat(copyEvens(new int[]{3, 2, 4, 5, 8}, 2), is(equalTo(new int[]{2, 4})));
        assertThat(copyEvens(new int[]{3, 2, 4, 5, 8}, 3), is(equalTo(new int[]{2, 4, 8})));
        assertThat(copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3), is(equalTo(new int[]{6, 2, 4})));
    }
}