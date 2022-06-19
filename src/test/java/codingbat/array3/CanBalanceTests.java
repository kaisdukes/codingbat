package codingbat.array3;

import org.junit.Test;

import static codingbat.array3.CanBalance.canBalance;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CanBalanceTests {

    @Test
    public void shouldReturnCanBalance() {
        assertThat(canBalance(new int[]{1, 1, 1, 2, 1}), is(equalTo(true)));
        assertThat(canBalance(new int[]{2, 1, 1, 2, 1}), is(equalTo(false)));
        assertThat(canBalance(new int[]{10, 10}), is(equalTo(true)));
    }
}