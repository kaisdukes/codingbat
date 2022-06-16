package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.FirstLast6.firstLast6;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FirstLast6Tests {

    @Test
    public void shouldReturnFirstLast6() {
        assertThat(firstLast6(new int[]{1, 2, 6}), is(equalTo(true)));
        assertThat(firstLast6(new int[]{6, 1, 2, 3}), is(equalTo(true)));
        assertThat(firstLast6(new int[]{13, 6, 1, 2, 3}), is(equalTo(false)));
    }
}