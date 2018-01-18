package lxq;
/*
* 第一问 xAxB
* 写一个CompareNumber类，只有一个函数，该函数接受两个参数
* */
public class CompareNumber {
    public static String compareToAnswer(int answer, int guess){
        String result = "";
        int countA = 0;
        int countB = 0;

        String answerAsString = String.valueOf(answer);
        char[] answerAsChar = answerAsString.toCharArray();

        String guessAsString = String.valueOf(guess);
        char[] guessAsChar = guessAsString.toCharArray();

        for(int i=0;i<answerAsChar.length;i++){
            if(answerAsChar[i] == guessAsChar[i]){
                countA++;
            }
        }
        for(int i=0;i<answerAsChar.length;i++){
            for(int j=0;j<guessAsChar.length;j++){
                /**位置不等，但是值相等时，countB++*/
                if(j!=i && answerAsChar[i]==guessAsChar[j]){
                    countB++;
                }
            }
        }
        result=""+countA+"A"+countB+"B";
        return result;
    }
}