import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;

public class Main extends JFrame {

    public final int WINDOW_WIDTH = 1000;
    public final int WINDOW_HEIGHT = 500;


    public static void main (String[] args){
        Main main = new Main();

    }
    public Main () {

        Font font = new Font("Ariel", Font.BOLD, 20);
        JLabel title = new JLabel();
        title.setText("Points");
        title.setBounds(WINDOW_WIDTH-100,0,90,30);
        title.setFont(font);
        title.setForeground(Color.WHITE);
        title.setBackground(Color.BLACK);
        title.setOpaque(true);//מבטל שקיפות
        this.add(title);



        Font font2 = new Font("Ariel", Font.BOLD, 20);
        JLabel title2 = new JLabel();
        title2.setText("Orel game");
        title2.setBounds(50,0,150,30);
        title2.setFont(font2);
        this.add(title2);


        JLabel title3 = new JLabel();
        title3.setText("0");
        title3.setBounds(WINDOW_WIDTH-100,title.getY()+title.getHeight(),title.getWidth(),title.getHeight());
        title3.setFont(font2);
        title3.setForeground(Color.WHITE);
        title3.setBackground(Color.BLACK);
        title3.setOpaque(true);
        this.add(title3);

        JButton button = new JButton();
        button.setBounds(title3.getX(),title3.getY()+title3.getHeight(),title3.getWidth(),title3.getHeight());
        button.setText("Click");
        this.add(button);
        button.addActionListener((event)->{
            String TextToInt = title3.getText();
            int counter = Integer.parseInt(title3.getText());
            counter++;
            title3.setText(String.valueOf(counter));
        });

        GameScene gameScene = new GameScene(0,60,WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);//שייך לעמוד קטגוריס
        // this.setLocationRelativeTo(null);// שם את החלון באמצע המסך
        this.setLayout(null);
        this.setVisible(true);// חלון גרפי
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// שלוחצים איקס זה סוגר לחלוטין את התוכנית
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);// רזויולציה של החלון | גודל
        this.setResizable(false);// לא משנה את הגודל של המסך



    }


}