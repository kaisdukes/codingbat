package codingbat.logic1;

public class AnswerCell {

    public static boolean answerCell(final boolean isMorning, final boolean isMom, final boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }
}