package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.GreenTicket.greenTicket;
import static codingbat.logic1.RedTicket.redTicket;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GreenTicketTests {

    @Test
    public void shouldReturnGreenTicket() {
        assertThat(greenTicket(1, 2, 3), is(equalTo(0)));
        assertThat(greenTicket(2, 2, 2), is(equalTo(20)));
        assertThat(greenTicket(1, 1, 2), is(equalTo(10)));
    }
}