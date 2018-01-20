package lxq;

import lxq.util.CharArrayUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;


public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator = new AnswerGenerator();

    @Test
    public void testIsFourDigits() {
        int answer = answerGenerator.generatorNumber();
        boolean flag = answer > 1000 && answer < 9999;
        assertTrue(flag);
    }

    @Test
    public void testDifferentDigits() {
        boolean flag = true;
        int answer = answerGenerator.generatorNumber();
        char[] answerAsChar = CharArrayUtil.getCharArrayFromInt(answer);
        Arrays.sort(answerAsChar);
        for (int i = 1; i < answerAsChar.length; i++) {
            /*有重复的位数*/
            if (answerAsChar[i] == answerAsChar[i - 1]) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }
}
