package codingbat.recursion1;

import org.junit.Test;

import static codingbat.recursion1.Triangle.triangle;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTests {

    @Test
    public void shouldReturnTriangle() {
        assertThat(triangle(0), is(equalTo(0)));
        assertThat(triangle(1), is(equalTo(1)));
        assertThat(triangle(2), is(equalTo(3)));
        assertThat(triangle(3), is(equalTo(6)));
        assertThat(triangle(4), is(equalTo(10)));
        assertThat(triangle(5), is(equalTo(15)));
    }
}