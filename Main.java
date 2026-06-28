import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Board board = new Board();
        WhiteKnight wKnight = new WhiteKnight();
        frame.setTitle("Chess App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.add(wKnight);
        frame.add(board);
        frame.pack();
        frame.setVisible(true);
    }
}