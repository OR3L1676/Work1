import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GameScene extends JPanel {

    private Player player;
    private Apple apple;
    private ArrayList<Apple> apples;
    private Random r;
    private int x= 50;
    private int y= 50;
    private int size = 25;
  //  private ImageIcon jek;

    public GameScene (int x, int y, int width, int height) {
        //this.setBackground(Color.BLUE); לא צריך כרגע (צובע את המסך)
        this.setBounds(x, y ,width ,height);
        setLayout(null);
        this.player = new Player(100, 100, 100, 50, Color.BLACK);
       // this.jek = new ImageIcon("images.png");
       // this.apple()
        this.mainGameLoop();
    }

    public void tick(){
        if (apples.size() == 0){
            int x = r.nextInt(900);
            int y = r.nextInt(400);

            apple = new Apple (x, y, 50, 50, Color.RED);
            apples.add(apple);
        }

        for(int i = 0; i< apples.size(); i++){
            if (x == apples.get(i).getX() && y == apples.get(i).getY()){
                size++;
                apples.remove(i);
                i--;
            }
        }
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.player.paint(g);
        //this.jek.paintIcon(this, g, 450, 270);
        for(int i = 0; i< apples.size(); i++){
            apples.get(i).paint(g);

        }
    }


    public void mainGameLoop () {
        //תהליכון ----------------------------------
       r = new Random();
        Thread t1 = new Thread(() -> {
            PlayerMovement playerMovement = new PlayerMovement(player);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(playerMovement);
            while(true){
                ///
                try{
                    repaint();
                    Thread.sleep(20);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();

//        Thread t2 = new Thread(() -> {
//
//        });

    }
}