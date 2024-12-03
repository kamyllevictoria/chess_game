package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;

import java.awt.*;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color); //construtor da superclasse chesspiece
    }

    @Override
    public String toString(){
        return "R";
    }

}
