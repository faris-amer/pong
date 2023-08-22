import javax.swing.*;
import java.awt.*;
public class PongGame extends JPanel {
    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;

    private Ball gameBall;
    private Paddle player1, player2;

    public PongGame(){

        gameBall = new Ball(300,200,3,3,3,10,Color.RED);
        player1 = new Paddle(10,200,75,3,Color.BLUE);
        player2 = new Paddle(610,200,75,3, Color.GREEN);
    }

    public void paintComponent(Graphics g){

        g.setColor(Color.BLACK);
        g.fillRect(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        gameBall.paint(g);

        player1.paint(g);
        player2.paint(g);
    }
    public void gameLogic(){
        gameBall.moveBall();

        gameBall.EdgeBounce(0, WINDOW_HEIGHT);
    }

}
