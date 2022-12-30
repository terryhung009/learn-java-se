import javax.swing.*;
import java.awt.*;

public class Main  extends JPanel {
    String type;
    int n;

    public Main(){
        type = JOptionPane.showInputDialog(
                "Do you want a addition table or multiplication table?( A or M )");
        n = Integer.parseInt(JOptionPane.showInputDialog("How big do you want the table to be ?"));
    }

    @Override
    public void paintComponent(Graphics g){


        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;
        int cellWidth = w / n;
        int cellHeight = h / n;


        //nested for loop

        for(int j = 1; j<=n ;j++){
            for(int i = 1; i<=n ; i++){
                g.setColor(Color.BLACK);
                if(i == 1 || j ==1){
                    g.setColor(Color.YELLOW);
                    g.fillRect(x,y,cellWidth,cellHeight);
//                    g.setColor(Color.BLACK);
//                    g.drawRect(x,y,cellWidth,cellHeight);

                }else{

                }
                g.setColor(Color.BLACK);
                g.drawRect(x,y,cellWidth,cellHeight);

                if(i == 1){
                    g.drawString("" + j,x+5,y+20);

                }else if(j==1){
                    g.drawString("" + i,x+5,y+20);;
                }else{
                    int value = 0;
                    if(type.toLowerCase().equals("a")){
                        value = i + j ;

                    }else if(type.toLowerCase().equals("m")){
                        value = i * j ;
                    }
                    g.drawString(""+ value,x+5,y+20);
                }


//                g.drawRect(x,y, cellWidth, cellHeight);

                x += cellWidth;
            }
            x=0;
            y+= cellHeight;
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new Main());
        window.setVisible(true);
    }
}
