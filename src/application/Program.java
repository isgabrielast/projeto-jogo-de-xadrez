package application;

import boardgame.Board;
import boardgame.Piece;
import chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

        input.close();
    }
}
