package lxq;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;


public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator = new AnswerGenerator();
    @Test
    public void testIsFourDigits(){
        int answer = answerGenerator.generatorFourDigits();
        boolean flag = answer>1000 && answer<9999;
        Assert.assertTrue(flag);
    }
    @Test
    public void testFourDifferentDigits(){
        boolean flag = true;
        int answer = answerGenerator.generatorFourDigits();
        char[] answerAsChar = new Utils().intToCharArray(answer);

        Arrays.sort(answerAsChar);
        for(int i=1;i<answerAsChar.length;i++){
            /*有重复的位数*/
            if(answerAsChar[i]==answerAsChar[i-1]){
                flag = false;
                break;
            }
        }
        Assert.assertTrue(flag);
    }
}
