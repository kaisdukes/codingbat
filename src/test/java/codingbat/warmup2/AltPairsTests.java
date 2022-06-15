package codingbat.warmup2;

import org.junit.Test;

import static codingbat.warmup2.AltPairs.altPairs;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AltPairsTests {

    @Test
    public void shouldReturnAltPairs() {
        assertThat(altPairs("kitten"), is(equalTo("kien")));
        assertThat(altPairs("Chocolate"), is(equalTo("Chole")));
        assertThat(altPairs("CodingHorror"), is(equalTo("Congrr")));
    }
}