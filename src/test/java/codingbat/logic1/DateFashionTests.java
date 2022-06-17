package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.DateFashion.dateFashion;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DateFashionTests {

    @Test
    public void shouldReturnDateFashion() {
        assertThat(dateFashion(5, 10), is(equalTo(2)));
        assertThat(dateFashion(5, 2), is(equalTo(0)));
        assertThat(dateFashion(5, 5), is(equalTo(1)));
    }
}