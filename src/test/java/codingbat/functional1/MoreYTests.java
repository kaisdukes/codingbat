package codingbat.functional1;

import org.junit.Test;

import java.util.List;

import static codingbat.functional1.MoreY.moreY;
import static java.util.Collections.emptyList;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MoreYTests {

    @Test
    public void shouldReturnMoreY() {
        assertThat(moreY(List.of("a", "b", "c")), is(equalTo(List.of("yay", "yby", "ycy"))));
        assertThat(moreY(List.of("hello", "there")), is(equalTo(List.of("yhelloy", "ytherey"))));
        assertThat(moreY(List.of("yay")), is(equalTo(List.of("yyayy"))));
        assertThat(moreY(emptyList()), is(equalTo(emptyList())));
    }
}