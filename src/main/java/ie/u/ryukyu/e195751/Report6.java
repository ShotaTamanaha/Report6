package ie.u.ryukyu.e195751;

import java.util.Random;
import java.util.Scanner;

public class Report6 {
    public static void main(String args[]) {
        int count = 0;
        junken x = new junken();
        try {
            for (int v=0;v<5;v++) {
                System.out.println("ジャンケン始めるぞー");
                System.out.println("2でジャンケンはこれで最後。それ以外のボタンを押すと続けるよー");
                System.out.println("それではボタンを押してください");
                Scanner a = new Scanner(System.in);
                int num = a.nextInt();
                if (num != 2) {
                    x.decide_player1();
                    x.decide_player2();
                    x.Judge();
                    count += 1;

                } else if (num == 2) {
                    System.out.println("終了！");
                    System.out.println("今回は" + count + "回ジャンケンをしました");
                    break;
                }
            }
        }catch (java.util.InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("数字以外は出力できません。");
            System.out.println("もう一度やり直してください");
        }
    }
}


class junken {
    int Rock = 0; //0を出したらグー
    int paper = 1; //1を出したらパー
    int scissors = 2; //2を出したらチョキ

    //player1を定義
    int player1;
    int player2;

    //プレイヤー１は自分なので自分で手を出すのを決めるメソッド
    public void decide_player1() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("出力してください");
            int hand1 = scan.nextInt();
            if (hand1 == Rock) {
                System.out.println("player1はグーを出しました。");
                player1 = Rock;
            } else if (hand1 == paper) {
                System.out.println("player1はパーを出しました。");
                player1 = paper;
            } else if (hand1 == scissors) {
                System.out.println("player1はチョキを出しました。");
                player1 = scissors;
            } else {
                System.out.println("0,1,2以外なので実行できません");
            }
        }catch (java.util.InputMismatchException x){
            System.out.println("文字列は読み込めません");
            System.out.println("もう一度やり直してください");
        }
    }

    public void decide_player2() {
        Random random = new Random();
        int hand2 = random.nextInt(2);
        if (hand2 == Rock) {
            System.out.println("player2はグーを出しました。");
            player2 = Rock;
        } else if (hand2 == paper) {
            System.out.println("player2はパーを出しました。");
            player2 = paper;
        } else if (hand2 == scissors) {
            System.out.println("player2はチョキを出しました。");
            player2 = scissors;
        }
    }


    //ジャンケンの判定とスコアの起動を決めるためのメソッド
    public void Judge() {
        if (player1 == scissors & player2 == scissors) {
            System.out.println("ジャンケンは引き分けです");
        } else if (player1 == Rock & player2 == Rock) {
            System.out.println("ジャンケンは引き分けです");
        } else if (player1 == paper & player2 == paper) {
            System.out.println("ジャンケンは引き分けです");
        } else if (player1 == Rock & player2 == paper) {
            System.out.println("ジャンケンはプレイヤー２の勝ち");
        } else if (player1 == paper & player2 == scissors) {
            System.out.println("ジャンケンはプレイヤー２の勝ち");

        } else if (player1 == scissors & player2 == Rock) {
            System.out.println("ジャンケンはプレイヤー2の勝ち");

        } else if (player1 == Rock & player2 == scissors) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");

        } else if (player1 == paper & player2 == Rock) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");

        } else if (player1 == scissors & player2 == paper) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");

        } else if(player1!=0&player1!=1&player1!=2) {
            System.out.println("0,1,2以外の数字なので実行出来ません");
        }
    }
}

class  Acchimuitehoi{

}

