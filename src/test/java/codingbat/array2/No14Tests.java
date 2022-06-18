package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.No14.no14;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class No14Tests {

    @Test
    public void shouldReturnNo14() {
        assertThat(no14(new int[]{1, 2, 3}), is(equalTo(true)));
        assertThat(no14(new int[]{1, 2, 3, 4}), is(equalTo(false)));
        assertThat(no14(new int[]{2, 3, 4}), is(equalTo(true)));
    }
}