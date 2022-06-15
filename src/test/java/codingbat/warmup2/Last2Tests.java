package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.Last2.last2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Last2Tests {

    @Test
    public void shouldReturnLast2() {
        assertThat(last2("hixxhi"), is(equalTo(1)));
        assertThat(last2("xaxxaxaxx"), is(equalTo(1)));
        assertThat(last2("axxxaaxx"), is(equalTo(2)));
        assertThat(last2("xxaxxaxxaxx"), is(equalTo(3)));
        assertThat(last2("xaxaxaxx"), is(equalTo(0)));
        assertThat(last2("xxxx"), is(equalTo(2)));
        assertThat(last2("13121312"), is(equalTo(1)));
        assertThat(last2("11212"), is(equalTo(1)));
        assertThat(last2("13121311"), is(equalTo(0)));
        assertThat(last2("1717171"), is(equalTo(2)));
        assertThat(last2("hi"), is(equalTo(0)));
        assertThat(last2("h"), is(equalTo(0)));
        assertThat(last2(""), is(equalTo(0)));
    }
}