import board.QueenBoard;
import game.NQueenGame;

public class App {
    public static void main(String[] args) throws Exception {

        QueenBoard b = new QueenBoard(4);
        NQueenGame g= new NQueenGame(b);
        g.play();
      
    }
}
