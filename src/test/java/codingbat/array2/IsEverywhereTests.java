package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.IsEverywhere.isEverywhere;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class IsEverywhereTests {

    @Test
    public void shouldReturnIsEverywhere() {
        assertThat(isEverywhere(new int[]{1, 2, 1, 3}, 1), is(equalTo(true)));
        assertThat(isEverywhere(new int[]{1, 2, 1, 3}, 2), is(equalTo(false)));
        assertThat(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1), is(equalTo(false)));
    }
}