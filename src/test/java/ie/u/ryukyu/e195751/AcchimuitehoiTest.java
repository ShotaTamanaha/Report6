package ie.u.ryukyu.e195751;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class AcchimuitehoiTest {
    Acchimuitehoi v = new Acchimuitehoi();

    @Test
    void player1_win_pattern() {
        int x =3;
        v.player1_patten=3;
        assertEquals(x,v.player1_patten);
    }

    @Test
    void player2_win_pattern() {
    }

    @Test
    void player2_lose_pattern() {
       int t =0;
       v.player1_patten=0;
            assertEquals(t,v.player1_patten);
        }



    @Test
    void player1_lose_pattern() {
    }

    @Test
    void player1_win_and_player2_lose_judge() {

    }
    @Test
    void player1_lose_and_player2_win_judge() {


}}