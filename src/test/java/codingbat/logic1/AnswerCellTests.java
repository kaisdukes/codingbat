package codingbat.logic1;

import org.junit.Test;

import static codingbat.logic1.AnswerCell.answerCell;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AnswerCellTests {

    @Test
    public void shouldAnswerCell() {
        assertThat(answerCell(false, false, false), is(equalTo(true)));
        assertThat(answerCell(false, false, true), is(equalTo(false)));
        assertThat(answerCell(true, false, false), is(equalTo(false)));
    }
}