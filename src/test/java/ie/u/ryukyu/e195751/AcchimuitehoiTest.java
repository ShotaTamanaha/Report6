package ie.u.ryukyu.e195751;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class AcchimuitehoiTest {

    @Test
    void player1_win_pattern() {
    }

    @Test
    void player2_win_pattern() {
    }

    @Test
    void player2_lose_pattern() {
    }

    @Test
    void player1_lose_pattern() {
    }

    @Test
    void player1_win_and_player2_lose_judge() {
        Acchimuitehoi n = new Acchimuitehoi();
        n.player1_patten = 2;
        n.player2_pattern = 2;
        assertEquals(n.player1_patten,n.player2_pattern);
    }
    @Test
    void player1_lose_and_player2_win_judge() {

            Acchimuitehoi k = new Acchimuitehoi();
            k.player1_patten=1;
            k.player2_pattern=1;
            assertEquals(k.player1_patten,k.player2_pattern);
}}