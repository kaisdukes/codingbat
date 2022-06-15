package codingbat.warmup1;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MonkeyTroubleTests {

    @Test
    public void shouldBeInTroubleIfBothOrNeitherAreSmiling() {
        assertThat(MonkeyTrouble.monkeyTrouble(false, false), is(equalTo(true)));
        assertThat(MonkeyTrouble.monkeyTrouble(true, false), is(equalTo(false)));
        assertThat(MonkeyTrouble.monkeyTrouble(false, true), is(equalTo(false)));
        assertThat(MonkeyTrouble.monkeyTrouble(true, true), is(equalTo(true)));
    }
}