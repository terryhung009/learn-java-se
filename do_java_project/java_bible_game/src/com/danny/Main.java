package com.danny;

import com.danny.GameView.DisasterView;
import com.danny.GameView.GameView;
import com.danny.GameView.RedSeaGameView;
import com.danny.GameView.TencommandmentsView;
import com.danny.Spirte.DisasterView.Bug;
import com.danny.Spirte.DisasterView.Frog;
import com.danny.Spirte.DisasterView.Ice;
import com.danny.Spirte.Moses;
import com.danny.Spirte.RedSeaViewSprite.Anubis;
import com.danny.Spirte.RedSeaViewSprite.Cat;
import com.danny.Spirte.RedSeaViewSprite.Pharoah;
import com.danny.Spirte.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {

    public static final int CELL = 50;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int ROW = HEIGHT / CELL ;
    public static final int COLUMN = WIDTH / CELL ;

    Moses moses;
    public static GameView gameView;
    private int level;

    public Main(){
        level = 1;
        resetGame(new DisasterView());
//        moses = new Moses(1, 1);
//        gameView = new DisasterView();
        addKeyListener(this);


    }

    private boolean changeLevel(String result){
        if(result.equals("Next level")){
            level++;
            if(level == 2){
                resetGame(new RedSeaGameView());
            }else if(level == 3){
                resetGame(new TencommandmentsView());
            }

            return true;
        }

        return false;
    }


    public void resetGame(GameView game){
//        level = 1;
        moses = new Moses(1 , 1);
        gameView = game;
        repaint();
    }


    @Override
    public Dimension getPreferredSize(){
        return new Dimension(WIDTH, HEIGHT);

    }

    @Override
    public void paintComponent(Graphics g){
        gameView.drawView(g);
        moses.draw(g);
        requestFocusInWindow();

    }



    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Point mosesPoint = moses.getRelativePosition();
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                if(mosesPoint.y >1){
                    String result = moses.overlap(mosesPoint.x, mosesPoint.y -1);
                    if(result.equals("Die")){
                        //reset game
                        level=1;
                        JOptionPane.showMessageDialog(this,"You die. Please try again.");
                        resetGame(new DisasterView());
                        return;

                    }
                    if(!result.equals("Cannot move")){
                        mosesPoint.y -= 1;
                    }
                    if(result.equals("Game over")){
                        JOptionPane.showMessageDialog(this,"You win the game.");
                        return;
                    }


                    if(changeLevel(result)) return;


                }
                break;
            case KeyEvent.VK_DOWN:
                if(mosesPoint.y < ROW ){
                    String result = moses.overlap(mosesPoint.x, mosesPoint.y +1);
                    if(result.equals("Die")){
                        //reset game
                        level=1;
                        JOptionPane.showMessageDialog(this,"You die. Please try again.");
                        resetGame(new DisasterView());
                        return;

                    }
                    if(!result.equals("Cannot move")){
                        mosesPoint.y +=1;
                    }
                    if(result.equals("Game over")){
                        JOptionPane.showMessageDialog(this,"You win the game.");
                        return;
                    }

                    if(changeLevel(result)) return;




                }
                break;
            case  KeyEvent.VK_RIGHT:
                if(mosesPoint.x < COLUMN){
                    String result = moses.overlap(mosesPoint.x + 1 , mosesPoint.y);
                    if(result.equals("Die")){
                        //reset game
                        level=1;
                        JOptionPane.showMessageDialog(this,"You die. Please try again.");
                        resetGame(new DisasterView());
                        return;

                    }
                    if(!result.equals("Cannot move")){
                        mosesPoint.x += 1;
                    }
                    if(result.equals("Game over")){
                        JOptionPane.showMessageDialog(this,"You win the game.");
                        return;
                    }
                    if(changeLevel(result)) return;

                }
                break;
            case  KeyEvent.VK_LEFT:
                if(mosesPoint.x > 1){
                    String result = moses.overlap(mosesPoint.x - 1 , mosesPoint.y);
                    if(result.equals("Die")){
                        //reset game
                        level=1;
                        JOptionPane.showMessageDialog(this,"You die. Please try again.");
                        resetGame(new DisasterView());
                        return;

                    }
                    if(!result.equals("Cannot move")){
                        mosesPoint.x -= 1;
                    }
                    if(result.equals("Game over")){
                        JOptionPane.showMessageDialog(this,"You win the game.");
                        return;
                    }
                    if(changeLevel(result)) return;

                }
                break;

            case KeyEvent.VK_W:
                for(int i = mosesPoint.y;i>0;i--){
                    for(Sprite s : gameView.getElements()){
                        if(s.getRelativePosition() != null
                                && s.getRelativePosition().x == mosesPoint.x
                                && s.getRelativePosition().y == i){
                            if(s instanceof Cat || s instanceof Ice){
                                return;
                            }
                            if(s instanceof Pharoah || s instanceof Anubis || s instanceof Frog || s instanceof Bug){
                                s.setNullPosition();
                                repaint();
                                return;
                            }

                        }
                    }
                }
                break;
            case KeyEvent.VK_S:
                for(int i = mosesPoint.y;i <= ROW ;i++){
                    for(Sprite s : gameView.getElements()){
                        if(s.getRelativePosition() != null
                                && s.getRelativePosition().x == mosesPoint.x
                                && s.getRelativePosition().y == i){
                            if(s instanceof Cat || s instanceof Ice){
                                return;
                            }
                            if(s instanceof Pharoah || s instanceof Anubis || s instanceof Frog || s instanceof Bug){
                                s.setNullPosition();
                                repaint();
                                return;
                            }

                        }
                    }
                }
                break;
            case KeyEvent.VK_D:
                for(int i = mosesPoint.x;i <= COLUMN ;i++){
                    for(Sprite s : gameView.getElements()){
                        if(s.getRelativePosition() != null
                                && s.getRelativePosition().x == i
                                && s.getRelativePosition().y == mosesPoint.y){
                            if(s instanceof Cat || s instanceof Ice){
                                return;
                            }
                            if(s instanceof Pharoah || s instanceof Anubis || s instanceof Frog || s instanceof Bug){
                                s.setNullPosition();
                                repaint();
                                return;
                            }

                        }
                    }
                }
                break;
            case KeyEvent.VK_A:
                for(int i = mosesPoint.x;i >0 ;i--){
                    for(Sprite s : gameView.getElements()){
                        if(s.getRelativePosition() != null
                                && s.getRelativePosition().x == i
                                && s.getRelativePosition().y == mosesPoint.y){
                            if(s instanceof Cat || s instanceof Ice){
                                return;
                            }
                            if(s instanceof Pharoah || s instanceof Anubis || s instanceof Frog || s instanceof Bug){
                                s.setNullPosition();
                                repaint();
                                return;
                            }

                        }
                    }
                }
                break;
        }

        moses.setPosition(mosesPoint);
        repaint();




    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}