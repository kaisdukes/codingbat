package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.MaxBlock.maxBlock;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MaxBlockTests {

    @Test
    public void shouldReturnMaxBlock() {
        assertThat(maxBlock("hoopla"), is(equalTo(2)));
        assertThat(maxBlock("abbCCCddBBBxx"), is(equalTo(3)));
        assertThat(maxBlock(""), is(equalTo(0)));
    }
}