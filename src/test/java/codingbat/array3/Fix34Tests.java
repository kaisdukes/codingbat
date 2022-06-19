package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.Fix34.fix34;
import static codingbat.array3.MaxSpan.maxSpan;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Fix34Tests {

    @Test
    public void shouldFix34() {
        assertThat(fix34(new int[]{1, 3, 1, 4}), is(equalTo(new int[]{1, 3, 4, 1})));
        assertThat(fix34(new int[]{1, 3, 1, 4, 4, 3, 1}), is(equalTo(new int[]{1, 3, 4, 1, 1, 3, 4})));
        assertThat(fix34(new int[]{3, 2, 2, 4}), is(equalTo(new int[]{3, 4, 2, 2})));
    }
}