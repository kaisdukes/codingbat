package codingbat.string3;

import org.junit.Test;

import static codingbat.string3.MirrorEnds.mirrorEnds;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MirrorEndsTests {

    @Test
    public void shouldReturnMirrorEnds() {
        assertThat(mirrorEnds("abXYZba"), is(equalTo("ab")));
        assertThat(mirrorEnds("abca"), is(equalTo("a")));
        assertThat(mirrorEnds("aba"), is(equalTo("aba")));
    }
}