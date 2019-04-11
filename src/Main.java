/**
 * Created by avokado on 11.04.2019.
 *
 */
public class Main {

    public static void main(String[] args) {

        if (new Validator().isValid(args)) {
            ChessBoard chessBoard = new ChessBoard(args);
            chessBoard.printChessBoard();
        }
    }
}
