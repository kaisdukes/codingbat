package codingbat.array2;

import org.junit.Test;

import static codingbat.array2.Post4.post4;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Post4Tests {

    @Test
    public void shouldReturnPost4() {
        assertThat(post4(new int[]{2, 4, 1, 2}), is(equalTo(new int[]{1, 2})));
        assertThat(post4(new int[]{4, 1, 4, 2}), is(equalTo(new int[]{2})));
        assertThat(post4(new int[]{4, 4, 1, 2, 3}), is(equalTo(new int[]{1, 2, 3})));
    }
}