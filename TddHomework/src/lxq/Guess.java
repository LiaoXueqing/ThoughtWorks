package lxq;

import java.util.Arrays;

/*
* 第三问 Guess类，集成前两问
*/
public class Guess {
    private CompareNumber compareNumber = new CompareNumber();
    private AnswerGenerator answerGenerator = new AnswerGenerator();

    public String guessTheDigit(int guessDigit){
        int answerDigit = answerGenerator.generatorNumber();
        String result = compareNumber.compareToAnswer(answerDigit,guessDigit);
        return result;
    }
}
