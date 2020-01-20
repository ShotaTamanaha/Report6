package ie.u.ryukyu.e195751;

import java.util.Random;
import java.util.Scanner;

public class Report6 {
    public static void main(String args[]) {
        int count = 0;
        junken x = new junken();
        try {
            while (true) {
                System.out.println("ジャンケン始めるぞー");
                System.out.println("2でジャンケンはこれで最後。それ以外のボタンを押すと続けるよー");
                System.out.println("それではボタンを押してください");
                Scanner a = new Scanner(System.in);
                int num = a.nextInt();
                if (num != 2) {
                    x.decide_player1();
                    x.decide_player2();
                    x.Judge();
                    count += 1; }
                else if (num == 2) {
                    System.out.println("終了！");
                    System.out.println("今回は" + count + "回あっち向いてホイをしました");
                    break; }
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
                player1 = Rock; }
            else if (hand1 == paper) {
                System.out.println("player1はパーを出しました。");
                player1 = paper; }
            else if (hand1 == scissors) {
                System.out.println("player1はチョキを出しました。");
                player1 = scissors; }
            else {
                System.out.println("0,1,2以外なので実行できません"); }
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
        Acchimuitehoi t = new Acchimuitehoi();
        if (player1 == scissors & player2 == scissors) {
            System.out.println("ジャンケンは引き分けです"); }
        else if (player1 == Rock & player2 == Rock) {
            System.out.println("ジャンケンは引き分けです"); }
        else if (player1 == paper & player2 == paper) {
            System.out.println("ジャンケンは引き分けです"); }
        else if (player1 == Rock & player2 == paper) {
            System.out.println("ジャンケンはプレイヤー２の勝ち");
            t.player1_lose_pattern();
            t.player2_win_pattern();
            t.player1_lose_and_player2_win_judge(); }
        else if (player1 == paper & player2 == scissors) {
            System.out.println("ジャンケンはプレイヤー２の勝ち");
            t.player1_lose_pattern();
            t.player2_win_pattern();
            t.player1_lose_and_player2_win_judge(); }
        else if (player1 == scissors & player2 == Rock) {
            System.out.println("ジャンケンはプレイヤー2の勝ち");
            t.player1_lose_pattern();
            t.player2_win_pattern();
            t.player1_lose_and_player2_win_judge(); }
        else if (player1 == Rock & player2 == scissors) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");
            t.player1_win_pattern();
            t.player2_lose_pattern();
            t.player1_win_and_player2_lose_judge(); }
        else if (player1 == paper & player2 == Rock) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");
            t.player1_win_pattern();
            t.player2_lose_pattern();
            t.player1_win_and_player2_lose_judge();}
        else if (player1 == scissors & player2 == paper) {
            System.out.println("ジャンケンはプレイヤー１の勝ち");
            t.player1_win_pattern();
            t.player2_lose_pattern();
            t.player1_win_and_player2_lose_judge();}
        else if(player1!=0&player1!=1&player1!=2) {
            System.out.println("0,1,2以外の数字なので実行出来ません"); }
    }

}

class  Acchimuitehoi {
    String[] array1 = {"あっち向いてホイ➡️", "あっち向いてホイ⬅️", "あっち向いてホイ⬆️", "あっち向いてホイ⬇️"};
    String[] array2 = {"➡️", "⬅️", "⬆️️", "⬇️️"};

    int n, t, k, b;

    int player1_patten, player2_pattern;


    void player1_win_pattern() {
        try {
            System.out.println("ボタンを押してください");
            Scanner scanner = new Scanner(System.in);
            t = scanner.nextInt();
            if (t == 0) {
                System.out.println(array1[0]);
                player1_patten = 0;
            } else if (t == 1) {
                System.out.println(array1[1]);
                player1_patten = 1;
            } else if (t == 2) {
                System.out.println(array1[2]);
                player1_patten = 2;
            } else if (t == 3) {
                System.out.println(array1[3]);
                player1_patten = 3;
            }
        }catch (java.util.InputMismatchException x){
            System.out.println("文字列が読み込めません");
            System.out.println("もう一度やり直してください"); }
        }



        void player2_win_pattern(){
            Random random = new Random();
            n = random.nextInt(3);
            if (n == 0) {
                System.out.println(array1[0]);
                player2_pattern = 0;
            } else if (n == 1) {
                System.out.println(array1[1]);
                player2_pattern = 1;
            } else if (n == 2) {
                System.out.println(array1[2]);
                player2_pattern = 2;
            } else if (n == 3) {
                System.out.println(array1[3]);
                player2_pattern = 3;}
        }

        void player2_lose_pattern(){
            Random random = new Random();
            b = random.nextInt(3);
            if (b == 0) {
                System.out.println(array2[0]);
                player2_pattern = 0;
            } else if (b == 1) {
                System.out.println(array2[1]);
                player2_pattern = 1;
            } else if (b == 2) {
                System.out.println(array2[2]);
                player2_pattern = 2;
            } else if (b == 3) {
                System.out.println(array2[3]);
                player2_pattern = 3;
            }
        }

        void player1_lose_pattern() {
            try {
                System.out.println("ボタンを押してください");
                Scanner v = new Scanner(System.in);
                k = v.nextInt();
                if (k == 0) {
                    System.out.println(array2[0]);
                    player1_patten = 0;
                } else if (k == 1) {
                    System.out.println(array2[1]);
                    player1_patten = 1;
                } else if (k == 2) {
                    System.out.println(array2[2]);
                    player1_patten = 2;
                } else if (k == 3) {
                    System.out.println(array2[3]);
                    player1_patten = 3; }
            }catch (java.util.InputMismatchException x){
                System.out.println("文字列は読み込めません");
                System.out.println("もう一度やり直してください"); }
        }

        void player1_win_and_player2_lose_judge () {
            if (player1_patten == 0 & player2_pattern == 0 || player1_patten == 1 & player2_pattern == 1 || player1_patten == 2 & player2_pattern == 2 || player1_patten == 3 & player2_pattern == 3) {
                System.out.println("プレイヤー１の勝ちです。");
            } else if (player1_patten == 0 & player2_pattern == 1 || player1_patten == 0 & player2_pattern == 2 || player1_patten == 0 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 1 & player2_pattern == 0 || player1_patten == 1 & player2_pattern == 2 || player1_patten == 1 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 2 & player2_pattern == 0 || player1_patten == 2 & player2_pattern == 1 || player1_patten == 2 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 3 & player2_pattern == 0 || player1_patten == 3 & player2_pattern == 1 || player1_patten == 3 & player2_pattern == 2) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            }
        }

        void player1_lose_and_player2_win_judge () {
            if (player1_patten == 0 & player2_pattern == 0 || player1_patten == 1 & player2_pattern == 1 || player1_patten == 2 & player2_pattern == 2 || player1_patten == 3 & player2_pattern == 3) {
                System.out.println("プレイヤー2の勝ちです。");
            } else if (player1_patten == 0 & player2_pattern == 1 || player1_patten == 0 & player2_pattern == 2 || player1_patten == 0 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 1 & player2_pattern == 0 || player1_patten == 1 & player2_pattern == 2 || player1_patten == 1 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 2 & player2_pattern == 0 || player1_patten == 2 & player2_pattern == 1 || player1_patten == 2 & player2_pattern == 3) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            } else if (player1_patten == 3 & player2_pattern == 0 || player1_patten == 3 & player2_pattern == 1 || player1_patten == 3 & player2_pattern == 2) {
                System.out.println("今の勝負では勝敗がわかりませんでした。");
            }
        }

}





