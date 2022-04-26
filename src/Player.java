import java.awt.*;

public class Player{

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Player(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void paint (Graphics graphics){
        graphics.fillRect(this.x, this.y, this.width, this.height);
        graphics.setColor(Color.GREEN);
    }

    public void moveRight(){
        this.x++;
    }

    public void moveLeft(){
        this.x--;
    }

    public void moveUp(){
        this.y--;
    }

    public void moveDown(){
        this.y++;
    }

}