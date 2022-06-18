package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.WithoutTen.withoutTen;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class WithoutTenTests {

    @Test
    public void shouldReturnWithoutTen() {
        assertThat(withoutTen(new int[]{1, 10, 10, 2}), is(equalTo(new int[]{1, 2, 0, 0})));
        assertThat(withoutTen(new int[]{10, 2, 10}), is(equalTo(new int[]{2, 0, 0})));
        assertThat(withoutTen(new int[]{1, 99, 10}), is(equalTo(new int[]{1, 99, 0})));
    }
}