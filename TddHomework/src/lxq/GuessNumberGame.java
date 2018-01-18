package lxq;

import java.util.Arrays;
import java.util.Scanner;

/*
* 第四问 完成整个游戏
* 每次游戏有六次机会。
* 开始，打印“Welcome!”，空一行打印 “Please input your number(6):”
* 每次输入完回车打印出xAxB，空一行打印出新的”Please input your number(x):
* 输入的数字有重复位并回车时，在下面打印”Cannot input duplicate numbers!”
* 当6次都没猜中时，打印”Game Over”并退出
* 当猜中时，不要打印4A0B,而是打印”Congratulations!”并退出
* */
public class GuessNumberGame {
    private Guess guess = new Guess();
    private AnswerGenerator answerGenerator = new AnswerGenerator();
    private CompareNumber compareNumber = new CompareNumber();

    public static void main(String[] args){
        new GuessNumberGame().run();
    }
    /**
     * 判断number是否有重复位
     * 4位都不相等，返回true
     * 4位有相等的数，返回false
     */
    private boolean numberIsDifferent(int number){
        boolean flag = true;
        String numberAsString = String.valueOf(number);
        char[] numberAsChar = numberAsString.toCharArray();
        Arrays.sort(numberAsChar);
        for(int i=1;i<numberAsChar.length;i++){
            /*有重复的位数*/
            if(numberAsChar[i]==numberAsChar[i-1]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public void run(){
        int answerDigit = answerGenerator.generatorNumber();
        Scanner sc = new Scanner(System.in);
        String result = "";
        int guessDigit = 0;
        int count_guess = 6;
        System.out.println("Welcome!");
        System.out.println();
        while(count_guess>0){
            System.out.println("Please input your number("+count_guess+"): ");
            guessDigit = sc.nextInt();
            if(!numberIsDifferent(guessDigit)){
                System.out.println("Cannot input duplicate numbers!");
                count_guess--;
                continue;
            }
            result = compareNumber.compareToAnswer(answerDigit,guessDigit);
            if("4A0B".equals(result)){
                System.out.println("Congratulations!");
                break;
            }
            System.out.println(result);
            System.out.println();
            count_guess--;
        }
        if(count_guess==0){
            System.out.println("Game Over");
        }
    }
}
