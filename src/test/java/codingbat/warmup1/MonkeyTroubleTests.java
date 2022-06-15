package codingbat.warmup1;

import org.junit.Test;

import static codingbat.warmup1.MonkeyTrouble.monkeyTrouble;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MonkeyTroubleTests {

    @Test
    public void shouldBeInTroubleIfBothOrNeitherAreSmiling() {
        assertThat(monkeyTrouble(false, false), is(equalTo(true)));
        assertThat(monkeyTrouble(true, false), is(equalTo(false)));
        assertThat(monkeyTrouble(false, true), is(equalTo(false)));
        assertThat(monkeyTrouble(true, true), is(equalTo(true)));
    }
}