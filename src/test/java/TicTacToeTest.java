package test.java;
import org.junit.*;

import main.java.TicTacToe;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void testXWin() {
        TicTacToe game = new TicTacToe();
        game.set(0,0,'X');
        game.set(1,0,'O');
        game.set(0,1,'X');
        game.set(1,1,'O');
        game.set(0,2,'X');
        assertEquals('X', game.getWinner());
    }

    @Test
    public void testOWin() {
        TicTacToe game = new TicTacToe();
        game.set(0,0,'O');
        game.set(0,1,'O');
        game.set(0,2,'O');
        assertEquals('O', game.getWinner());
    }

    @Test
    public void testDraw() {
        TicTacToe game = new TicTacToe();
        game.set(0,0,'X'); game.set(0,1,'O'); game.set(0,2,'X');
        game.set(1,0,'X'); game.set(1,1,'O'); game.set(1,2,'O');
        game.set(2,0,'O'); game.set(2,1,'X'); game.set(2,2,'X');
        assertEquals('D', game.getWinner());
    }
}
