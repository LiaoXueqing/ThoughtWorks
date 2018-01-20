package lxq;

import lxq.util.CharArrayUtil;

/*
* 第一问 xAxB
* 写一个CompareNumber类，只有一个函数，该函数接受两个参数
* */
public class CompareNumber {
    public String compareToAnswer(int answer, int guess) {
        int countA = 0;
        int countB = 0;

        char[] answerAsChar = CharArrayUtil.getCharArrayFromInt(answer);
        char[] guessAsChar = CharArrayUtil.getCharArrayFromInt(guess);

        for (int i = 0; i < answerAsChar.length; i++) {
            if (answerAsChar[i] == guessAsChar[i]) {
                countA++;
                continue;
            }
            for (int j = 0; j < guessAsChar.length; j++) {
                /**位置不等，但是值相等时，countB++*/
                if (answerAsChar[i] == guessAsChar[j]) {
                    countB++;
                }
            }
        }
        String result = countA + "A" + countB + "B";
        return result;
    }

}