package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.CountPairs.countPairs;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountPairsTests {

    @Test
    public void shouldCountPairs() {
        assertThat(countPairs("axa"), is(equalTo(1)));
        assertThat(countPairs("axax"), is(equalTo(2)));
        assertThat(countPairs("axbx"), is(equalTo(1)));
        assertThat(countPairs("aa"), is(equalTo(0)));
        assertThat(countPairs("a"), is(equalTo(0)));
        assertThat(countPairs(""), is(equalTo(0)));
    }
}