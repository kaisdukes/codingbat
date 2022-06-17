package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.Blackjack.blackjack;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BlackjackTests {

    @Test
    public void shouldReturnBlackjack() {
        assertThat(blackjack(19, 21), is(equalTo(21)));
        assertThat(blackjack(21, 19), is(equalTo(21)));
        assertThat(blackjack(19, 22), is(equalTo(19)));
    }
}