package lxq;

/*
* 第三问 Guess类，集成前两问
*/
public class Guess {
    private CompareNumber compareNumber = new CompareNumber();
    private AnswerGenerator answerGenerator = new AnswerGenerator();
    private int answer=answerGenerator.generatorNumber();

    public String guessTheDigit(int guessDigit){
        String result = compareNumber.compareToAnswer(answer,guessDigit);
        return result;
    }
}
