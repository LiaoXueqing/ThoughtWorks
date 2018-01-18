package lxq;

import java.util.Arrays;
/*
* 第二问 随机数生成
* 要求只有一个函数，其实考虑扩展性
* */
public class AnswerGenerator {
    /**
     * 生成随机数
     * @return
     */
    private int getAnswer(){
        int answer = (int)(Math.random()*(9999-1000+1))+1000;
        return answer;
    }

    /**
     *判断生成的随机数是否存在重复的数值
     * @return
     */
    public int generatorNumber(){
        int answer = getAnswer();
        String answerAsString = "";
        boolean flag = true;
        do{
            answerAsString = String.valueOf(answer);
            char[] answerAsChar = answerAsString.toCharArray();
            Arrays.sort(answerAsChar);
            for(int i=1;i<answerAsChar.length;i++){
                /*有重复的位数,重新生成随机数，并跳出内层循环*/
                if(answerAsChar[i]==answerAsChar[i-1]){
                    flag = false;
                    answer = getAnswer();
                    break;
                }
            }
        }while(flag == false);
        return answer;
    }
}
