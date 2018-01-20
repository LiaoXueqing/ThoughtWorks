package lxq;

import lxq.util.CharArrayUtil;

import java.util.*;

/*
* 第二问 随机数生成
* 要求只有一个函数，其实考虑扩展性
* */
public class AnswerGenerator {
    /**
     * 生成随机数
     *
     * @return
     */
    private int getAnswer() {
        int answer = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        return answer;
    }


    private int getAnswerNew() {
        List<Integer> list = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        Collections.shuffle(list);
        int left = 4;
        String s = "";
        Iterator<Integer> it = list.iterator();
        while (left > 0) {
            int now = it.next();
            if (left == 1 && now == 0) {
                now = it.next();
            }
            s = now + s;
            left--;
        }
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100) {
            System.out.println(new AnswerGenerator().getAnswerNew());
        }
    }


    /**
     * 判断生成的随机数是否存在重复的数值
     *
     * @return
     */
    public int generatorNumber() {
        int answer = getAnswer();
        boolean flag = true;

        do {
            char[] answerAsChar = CharArrayUtil.getCharArrayFromInt(answer);
            Arrays.sort(answerAsChar);
            for (int i = 1; i < answerAsChar.length; i++) {
                /*有重复的位数,重新生成随机数，并跳出内层循环*/
                if (answerAsChar[i] == answerAsChar[i - 1]) {
                    flag = false;
                    answer = getAnswer();
                    break;
                }

                if (i == answerAsChar.length - 1 && answerAsChar[i] != answerAsChar[i - 1]) {
                    flag = true;
                }

            }

        } while (!flag);
        return answer;
    }
}
