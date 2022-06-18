package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.GHappy.gHappy;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GHappyTests {

    @Test
    public void shouldReturnGHappy() {
        assertThat(gHappy("xxggxx"), is(equalTo(true)));
        assertThat(gHappy("xxgxx"), is(equalTo(false)));
        assertThat(gHappy("xxggyygxx"), is(equalTo(false)));
    }
}