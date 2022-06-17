package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.RedTicket.redTicket;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class RedTicketTests {

    @Test
    public void shouldReturnRedTicket() {
        assertThat(redTicket(2, 2, 2), is(equalTo(10)));
        assertThat(redTicket(2, 2, 1), is(equalTo(0)));
        assertThat(redTicket(0, 0, 0), is(equalTo(5)));
    }
}