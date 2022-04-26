import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener {

    private Player player;



    public PlayerMovement (Player player){
        this.player = player;
    }

    public void keyTyped (KeyEvent e){// שמים את היד על הכפתור

    }

    public void keyPressed (KeyEvent e){//בנתיים עובדים רק בזה
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                player.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                player.moveDown();
                break;
            case KeyEvent.VK_RIGHT:
                player.moveRight();
                break;
            case KeyEvent.VK_LEFT:
                player.moveLeft();
                break;

        }
    }

    public void keyReleased (KeyEvent e){// מרימים את היד מהכפתור

    }
}