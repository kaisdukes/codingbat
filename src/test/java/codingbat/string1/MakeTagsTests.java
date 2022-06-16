package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.MakeTags.makeTags;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeTagsTests {

    @Test
    public void shouldMakeTags() {
        assertThat(makeTags("i", "Yay"), is(equalTo("<i>Yay</i>")));
        assertThat(makeTags("i", "Hello"), is(equalTo("<i>Hello</i>")));
        assertThat(makeTags("cite", "Yay"), is(equalTo("<cite>Yay</cite>")));
    }
}