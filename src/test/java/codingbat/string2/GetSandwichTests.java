package codingbat.string2;

import org.junit.Test;

import static codingbat.string2.GetSandwich.getSandwich;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GetSandwichTests {

    @Test
    public void shouldGetSandwich() {
        assertThat(getSandwich("breadjambread"), is(equalTo("jam")));
        assertThat(getSandwich("xxbreadjambreadyy"), is(equalTo("jam")));
        assertThat(getSandwich("xxbreadyy"), is(equalTo("")));
    }
}