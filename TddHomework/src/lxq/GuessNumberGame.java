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

    public static void main(String[] args) {
        new GuessNumberGame().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int guessDigit = 0;
        int count_guess = 6;
        System.out.println("Welcome!");
        System.out.println();
        while (count_guess > 0) {
            System.out.println("Please input your number(" + count_guess + "): ");
            guessDigit = sc.nextInt();
            String result = guess.guessTheDigit(guessDigit);
            if ("4A0B".equals(result)) {
                System.out.println("Congratulations!");
                break;
            }
            System.out.println(result);
            System.out.println();
            count_guess--;
        }
        if (count_guess == 0) {
            System.out.println("Game Over");
        }
    }

}
