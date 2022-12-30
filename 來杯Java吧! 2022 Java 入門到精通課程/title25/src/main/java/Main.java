import javax.swing.*;
import java.awt.*;

public class Main extends JPanel{
    @Override
    public void paintComponent(Graphics g){
//        int width = getWidth();
//        int height = getHeight();
//        g.drawString("Hello World", 10, 10);
//        g.drawLine(10,10,50,50);
//        g.setColor(Color.BLACK);
//        g.drawRect(100,100,50,60);
//        g.fillRect(100,100,50,60);
//        g.fillRect(0,0,300,300);
//        g.fillRect(0,0,width,height);
//        g.setColor(Color.RED);
//        g.drawLine(10,10,50,50);

//        g.setColor(Color.BLUE);
//        g.drawOval(0,0,200, 200);
//        g.fillOval(0,0,200, 200);

        ImageIcon img = new ImageIcon("ryan.jpeg");
        img.paintIcon(null , g , 50, 50);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setContentPane(new Main());
        window.setVisible(true);




    }
}
