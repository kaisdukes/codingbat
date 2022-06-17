package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.InOrder.inOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class InOrderTests {

    @Test
    public void shouldReturnInOrder() {
        assertThat(inOrder(1, 2, 4, false), is(equalTo(true)));
        assertThat(inOrder(1, 2, 1, false), is(equalTo(false)));
        assertThat(inOrder(1, 1, 2, true), is(equalTo(true)));
    }
}