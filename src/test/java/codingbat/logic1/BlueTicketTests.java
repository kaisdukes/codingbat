package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.BlueTicket.blueTicket;
import static codingbat.logic1.GreenTicket.greenTicket;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BlueTicketTests {

    @Test
    public void shouldReturnBlueTicket() {
        assertThat(blueTicket(9, 1, 0), is(equalTo(10)));
        assertThat(blueTicket(9, 2, 0), is(equalTo(0)));
        assertThat(blueTicket(6, 1, 4), is(equalTo(10)));
    }
}