import java.awt.*;

public class Ball {

    private int x, y, cx, cy, speed, size;
    private Color color;

    public Ball(int x, int y, int cx, int cy, int speed, int size, Color color){
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x,y,size,size);
    }

    public void moveBall(){
        x += cx;
        y += cy;
    }

    public void EdgeBounce(int top, int bottom){

        if (y>(bottom-size*2) | y<top){
            reverseY();
        }
        else if (x<0 | x>(640-size)){
            reverseX();
        }
    }
    public void reverseX(){
        cx *= -1;
    }
    public void reverseY(){
        cy *= -1;
    }
}
