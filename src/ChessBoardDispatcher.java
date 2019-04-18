public class ChessBoardDispatcher {

    void start(String[] args){

        try {
            if (new Validator().isValid(args)) {
                ConsoleWriter.printChessBoard(new ChessBoard(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            }
        }catch (Exception e){
            ConsoleWriter.printException(e);
        }
    }
}
