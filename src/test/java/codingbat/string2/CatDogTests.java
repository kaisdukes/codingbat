package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.CatDog.catDog;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CatDogTests {

    @Test
    public void shouldReturnCatDog() {
        assertThat(catDog("catdog"), is(equalTo(true)));
        assertThat(catDog("catcat"), is(equalTo(false)));
        assertThat(catDog("1cat1cadodog"), is(equalTo(true)));
    }
}