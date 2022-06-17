package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.SquirrelPlay.squirrelPlay;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquirrelPlayTests {

    @Test
    public void shouldReturnSquirrelPlay() {
        assertThat(squirrelPlay(70, false), is(equalTo(true)));
        assertThat(squirrelPlay(95, false), is(equalTo(false)));
        assertThat(squirrelPlay(95, true), is(equalTo(true)));
    }
}