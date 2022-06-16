package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.No23.no23;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class No23Tests {

    @Test
    public void shouldReturnNo23() {
        assertThat(no23(new int[]{4, 5}), is(equalTo(true)));
        assertThat(no23(new int[]{4, 2}), is(equalTo(false)));
        assertThat(no23(new int[]{3, 5}), is(equalTo(false)));
    }
}