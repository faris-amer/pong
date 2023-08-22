import javax.swing.*;
import java.awt.event.*;

public class Main {

    //declare and init frame
    static JFrame f = new JFrame("Pong");

    public static void main(String[] args) {

        //program exits when x clicked
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //set size, game will be 480*640
        f.setSize(650, 495);

        PongGame game = new PongGame();

        f.add(game);

        //show window
        f.setVisible(true);

        Timer timer = new Timer(33, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                game.gameLogic();
                //refresh the screen
                game.repaint();
            }
        });

        timer.start();
    }

}