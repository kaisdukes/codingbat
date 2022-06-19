package codingbat.ap1;

import org.junit.Test;

import static codingbat.ap1.UserCompare.userCompare;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UserCompareTests {

    @Test
    public void shouldReturnUserCompare() {
        assertThat(userCompare("bb", 1, "zz", 2), is(equalTo(-1)));
        assertThat(userCompare("bb", 1, "aa", 2), is(equalTo(1)));
        assertThat(userCompare("bb", 1, "bb", 1), is(equalTo(0)));
    }
}