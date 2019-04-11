public class ChessBoard {
    private int width;
    private int height;

    public ChessBoard(String[] args) {
        this.width = Integer.parseInt(args[0]);
        this.height = Integer.parseInt(args[1]);
    }

    void printChessBoard() {

        for (int i = 0; i < width; i++) {
            printLine(i);
            System.out.println();
        }
    }

    private void printLine(int lineNumber){

        if (lineNumber % 2 == 0){
            for (int i = 0; i < height; i++) {
                if (i % 2 == 0) {
                    System.out.print((char)9632);
                } else
                    System.out.print(" ");
            }
        }else{
            for (int i = 0; i < height; i++) {
                if (i % 2 == 0) {
                    System.out.print(" ");
                } else
                    System.out.print((char)9632);
            }
        }
    }
}
