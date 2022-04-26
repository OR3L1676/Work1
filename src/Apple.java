import java.awt.*;

public class Apple {

   private int x;
   private int y;
   private int width;
   private int height;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    private Color color;

    public Apple(int x, int y, int width, int height, Color color){
       this.x = x;
       this.y = y;
       this.width = width;
       this.height = height;
       this.color = color;
    }

    public void tick() {

    }

    public void paint (Graphics graphics){
        graphics.fillRect(this.x, this.y, this.width, this.height);
        graphics.setColor(Color.RED);
    }
}
