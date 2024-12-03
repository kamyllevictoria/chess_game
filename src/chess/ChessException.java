package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUIA = 1L;
    public ChessException(String msg){
        super(msg);
    }
}
