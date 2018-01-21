package lxq;

import java.util.*;

/*
* 第二问 随机数生成
* 要求只有一个函数，其实考虑扩展性
* */
public class AnswerGenerator {
    /**
     * 生成随机数
     * @return
     */
    public int generatorFourDigits(){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        int left = 4;
        ListIterator<Integer> it = list.listIterator();
        String result = "";
        while((left--)!=0){
            int n = it.next();
            if(n==0 && left==1){
                n = it.next();
            }
            result = n+result;
        }
        int answer = Integer.parseInt(result);
        return answer;
    }
}
