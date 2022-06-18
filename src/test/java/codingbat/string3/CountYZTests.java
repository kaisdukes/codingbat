package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.CountYZ.countYZ;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountYZTests {

    @Test
    public void shouldCountYZ() {
        assertThat(countYZ("fez day"), is(equalTo(2)));
        assertThat(countYZ("day fez"), is(equalTo(2)));
        assertThat(countYZ("day fyyyz"), is(equalTo(2)));
        assertThat(countYZ("DAY abc XYZ"), is(equalTo(2)));
        assertThat(countYZ("yak zak"), is(equalTo(0)));
    }
}