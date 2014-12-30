/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class TriquiGame {
    
    private static final int EMPTY_CELL = 0;
    private static final int X_CELL = 1;
    private static final int O_CELL = 2;
    
    private String player1;
    private String player2;
    private int board[][];
    private boolean turn;
    private int winner;
    private int playsCounter;
    
    public TriquiGame(String player1) {
        this.player1 = player1;
        this.board = new int[3][3];
        this.turn = true;
        this.winner = 0;
        this.playsCounter = 0;
    }
    
    public String getPlayer1() {
        return player1;
    }
    
    public String getPlayer2() {
        return player2;
    }
    
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }
    
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
    
    public void clearBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = EMPTY_CELL;
            }
        }
        this.turn = true;
        this.winner = 0;
        this.playsCounter = 0;
    }
    
    public boolean play(boolean userPlayed, int posI, int posJ) {
        if (player1 == null && player2 == null) return false;
        if (posI >= 0 && posI < 3 && posJ >= 0 && posJ < 3) {
            if (userPlayed == turn) {
                if (board[posI][posJ] == EMPTY_CELL) {
                    if (turn) board[posI][posJ] = X_CELL;
                    else board[posI][posJ] = O_CELL;
                    turn = !turn;
                    playsCounter++;
                    if (playsCounter == 9) winner = 3;
                    if (checkIfWins(X_CELL)) winner = X_CELL;
                    if (checkIfWins(O_CELL)) winner = O_CELL;
                    return true;
                }
            }
        }
        return false;
    }
    
    /* Retorna:
       1) Turno de la X
       2) Turno de la O
       3) Las X ganaron
       4) Las O ganaron
       5) Empate
    */
    public int getTurn() {
        if (winner != 0) return winner + 2;
        if (turn) return X_CELL;
        else return O_CELL;
    }
    
    public int [][] getBoard() {
        return board;
    }
    
    private boolean checkIfWins(int symbol) {
      for (int i = 0; i < 3; i++) {
        int contHor, contVer, contDiag1, contDiag2;
        contHor = contVer = contDiag1 = contDiag2 = 0;
        for (int j = 0; j < 3; j++) {
          contHor += (board[i][j] == symbol ? 1 : 0);
          contVer += (board[j][i] == symbol ? 1 : 0);
          contDiag1 += (board[j][j] == symbol ? 1 : 0);
          contDiag2 += (board[2-j][j] == symbol ? 1 : 0);
        }
        if (contHor == 3 || contVer == 3 ||
            contDiag1 == 3 || contDiag2 == 3) return true;
      }
      return false;
    }
}
