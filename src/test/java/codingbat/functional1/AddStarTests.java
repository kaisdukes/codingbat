package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.AddStar.addStar;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AddStarTests {

    @Test
    public void shouldAddStar() {
        assertThat(addStar(List.of("a", "bb", "ccc")), is(equalTo(List.of("a*", "bb*", "ccc*"))));
        assertThat(addStar(List.of("hello", "there")), is(equalTo(List.of("hello*", "there*"))));
        assertThat(addStar(List.of("*")), is(equalTo(List.of("**"))));
        assertThat(addStar(emptyList()), is(equalTo(emptyList())));
    }
}