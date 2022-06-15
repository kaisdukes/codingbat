package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.Has271.has271;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Has271Tests {

    @Test
    public void shouldReturnHas271() {
        assertThat(has271(new int[]{1, 2, 7, 1}), is(equalTo(true)));
        assertThat(has271(new int[]{1, 2, 8, 1}), is(equalTo(false)));
        assertThat(has271(new int[]{2, 7, 1}), is(equalTo(true)));
        assertThat(has271(new int[]{3, 8, 2}), is(equalTo(true)));
        assertThat(has271(new int[]{2, 7, 3}), is(equalTo(true)));
        assertThat(has271(new int[]{2, 7, 4}), is(equalTo(false)));
        assertThat(has271(new int[]{2, 7, -1}), is(equalTo(true)));
        assertThat(has271(new int[]{2, 7, -2}), is(equalTo(false)));
        assertThat(has271(new int[]{4, 5, 3, 8, 0}), is(equalTo(true)));
        assertThat(has271(new int[]{4, 5, 3, 8, 0}), is(equalTo(true)));
        assertThat(has271(new int[]{2, 7, -2, 4, 9, 3}), is(equalTo(true)));
        assertThat(has271(new int[]{2, 7, 5, 10, 1}), is(equalTo(false)));
        assertThat(has271(new int[]{2, 7, -2, 4, 10, 2}), is(equalTo(false)));
        assertThat(has271(new int[]{1, 1, 4, 9, 0}), is(equalTo(false)));
        assertThat(has271(new int[]{1, 1, 4, 9, 4, 9, 2}), is(equalTo(true)));
    }
}