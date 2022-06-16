package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.Unlucky1.unlucky1;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Unlucky1Tests {

    @Test
    public void shouldReturnUnlucky1() {
        assertThat(unlucky1(new int[]{1, 3, 4, 5}), is(equalTo(true)));
        assertThat(unlucky1(new int[]{2, 1, 3, 4, 5}), is(equalTo(true)));
        assertThat(unlucky1(new int[]{1, 1, 1}), is(equalTo(false)));
    }
}