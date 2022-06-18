package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.TenRun.tenRun;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TenRunTests {

    @Test
    public void shouldReturnTenRun() {
        assertThat(tenRun(new int[]{2, 10, 3, 4, 20, 5}), is(equalTo(new int[]{2, 10, 10, 10, 20, 20})));
        assertThat(tenRun(new int[]{10, 1, 20, 2}), is(equalTo(new int[]{10, 10, 20, 20})));
        assertThat(tenRun(new int[]{10, 1, 9, 20}), is(equalTo(new int[]{10, 10, 10, 20})));
    }
}