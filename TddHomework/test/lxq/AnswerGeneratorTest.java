package lxq;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator = new AnswerGenerator();
    @Test
    public void testIsFourDigits(){
        int answer = answerGenerator.generatorNumber();
        boolean flag = answer>1000 && answer<9999;
        assertThat(true,is(flag));
    }
    @Test
    public void testFourDifferentDigits(){
        boolean flag = true;
        int answer = answerGenerator.generatorNumber();
        String answerAsString = String.valueOf(answer);
        char[] answerAsChar = answerAsString.toCharArray();
        Arrays.sort(answerAsChar);
        for(int i=1;i<answerAsChar.length;i++){
            /*有重复的位数*/
            if(answerAsChar[i]==answerAsChar[i-1]){
                flag = false;
                break;
            }
        }
        assertThat(true,is(flag));
    }
}
