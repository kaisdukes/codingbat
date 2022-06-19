package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.Fix45.fix45;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Fix45Tests {

    @Test
    public void shouldFix45() {
        assertThat(fix45(new int[]{5, 4, 9, 4, 9, 5}), is(equalTo(new int[]{9, 4, 5, 4, 5, 9})));
        assertThat(fix45(new int[]{1, 4, 1, 5}), is(equalTo(new int[]{1, 4, 5, 1})));
        assertThat(fix45(new int[]{1, 4, 1, 5, 5, 4, 1}), is(equalTo(new int[]{1, 4, 5, 1, 1, 4, 5})));
    }
}