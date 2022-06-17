package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.TeaParty.teaParty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TeaPartyTests {

    @Test
    public void shouldReturnTeaParty() {
        assertThat(teaParty(6, 8), is(equalTo(1)));
        assertThat(teaParty(3, 8), is(equalTo(0)));
        assertThat(teaParty(20, 6), is(equalTo(2)));
    }
}