package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Pre4.pre4;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Pre4Tests {

    @Test
    public void shouldReturnPre4() {
        assertThat(pre4(new int[]{1, 2, 4, 1}), is(equalTo(new int[]{1, 2})));
        assertThat(pre4(new int[]{3, 1, 4}), is(equalTo(new int[]{3, 1})));
        assertThat(pre4(new int[]{1, 4, 4}), is(equalTo(new int[]{1})));
    }
}