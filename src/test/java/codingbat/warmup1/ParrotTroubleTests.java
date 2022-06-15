package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.MonkeyTrouble.monkeyTrouble;
import static codingbat.warmup1.ParrotTrouble.parrotTrouble;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ParrotTroubleTests {

    @Test
    public void shouldBeInTroubleIfTalkingOutOfHours() {
        assertThat(parrotTrouble(false, 0), is(equalTo(false)));
        assertThat(parrotTrouble(true, 0), is(equalTo(true)));
        assertThat(parrotTrouble(true, 6), is(equalTo(true)));
        assertThat(parrotTrouble(true, 7), is(equalTo(false)));
        assertThat(parrotTrouble(true, 20), is(equalTo(false)));
        assertThat(parrotTrouble(true, 21), is(equalTo(true)));
        assertThat(parrotTrouble(false, 0), is(equalTo(false)));
        assertThat(parrotTrouble(false, 6), is(equalTo(false)));
        assertThat(parrotTrouble(false, 7), is(equalTo(false)));
        assertThat(parrotTrouble(false, 20), is(equalTo(false)));
        assertThat(parrotTrouble(false, 21), is(equalTo(false)));
    }
}