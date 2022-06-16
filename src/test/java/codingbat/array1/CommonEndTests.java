package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.CommonEnd.commonEnd;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CommonEndTests {

    @Test
    public void shouldReturnCommonEnd() {
        assertThat(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), is(equalTo(true)));
        assertThat(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), is(equalTo(false)));
        assertThat(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), is(equalTo(true)));
    }
}