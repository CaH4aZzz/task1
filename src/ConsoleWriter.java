/**
 * Created by avokado on 19.04.2019.
 */
public class ConsoleWriter {

    static void printChessBoard (ChessBoard chessBoard){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chessBoard.getHeight(); i++) {
            for (int j = 0; j < chessBoard.getWidth(); j++) {
                if ((i + j) % 2 == 0) sb.append((char)9632);
                else sb.append('_');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void printException(Exception e){
        System.out.println(e.getMessage());
    }
}
