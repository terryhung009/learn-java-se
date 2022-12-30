import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Main extends JPanel implements KeyListener {
    Sheep s;

    public Main(){
        s = new Sheep(40,40);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        s.drawSheep(g);
        requestFocusInWindow();

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setContentPane(new Main());
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);



        Sheep s = new Sheep(0,0);

//        System.out.println(s.getClass().getName());
        System.out.println(s);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k =e.getKeyCode();
//        System.out.println(k);
//        if(k== KeyEvent.VK_UP){
//            s.walk(0,-5);
//        }
//        if(k == KeyEvent.VK_DOWN){
//            s.walk(0,5);
//        }
//        if(k == KeyEvent.VK_RIGHT){
//            s.walk(5,0);
//        }
//        if(k== KeyEvent.VK_LEFT){
//            s.walk(-5,0);
//        }
        switch (k){
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                s.walk(0,-5);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                s.walk(0,5);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                s.walk(5,0);
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                s.walk(-5,0);
                break;
            default:
                JOptionPane.showMessageDialog(this,"Please use an arrow key.");

        }

        System.out.println(s);
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
