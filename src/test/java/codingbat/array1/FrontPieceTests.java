package codingbat.array1;

import org.junit.Test;

import static codingbat.array1.FrontPiece.frontPiece;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FrontPieceTests {

    @Test
    public void shouldReturnFrontPiece() {
        assertThat(frontPiece(new int[]{1, 2, 3}), is(equalTo(new int[]{1, 2})));
        assertThat(frontPiece(new int[]{1, 2}), is(equalTo(new int[]{1, 2})));
        assertThat(frontPiece(new int[]{1}), is(equalTo(new int[]{1})));
        assertThat(frontPiece(new int[]{}), is(equalTo(new int[]{})));
    }
}