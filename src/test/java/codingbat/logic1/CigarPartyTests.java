package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.CigarParty.cigarParty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CigarPartyTests {

    @Test
    public void shouldReturnCigarParty() {
        assertThat(cigarParty(30, false), is(equalTo(false)));
        assertThat(cigarParty(50, false), is(equalTo(true)));
        assertThat(cigarParty(70, true), is(equalTo(true)));
    }
}