package codingbat.logic2;

import org.junit.Test;

import static codingbat.logic2.MakeChocolate.makeChocolate;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeChocolateTests {

    @Test
    public void shouldMakeChocolate() {
        assertThat(makeChocolate(4, 1, 9), is(equalTo(4)));
        assertThat(makeChocolate(4, 1, 10), is(equalTo(-1)));
        assertThat(makeChocolate(4, 1, 7), is(equalTo(2)));
    }
}