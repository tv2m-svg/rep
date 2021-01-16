package task42;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class BallThread extends Thread {
    JPanel panel;
    private int posX, posY;
    private final int SPEED = 4;
    private final int BALL_SIZE = 15;
    private double alpha;

    public BallThread(JPanel panel) {
        this.panel = panel;
        posX = 10;
        posY = 10;
        alpha = Math.random()*10;
    }

    
    @Override
    public void run() {
        while (true) {
            posX += (int) (SPEED * Math.cos(alpha));
            posY += (int) (SPEED * Math.sin(alpha));
            //вычисление угла отражения 
            if (posX >= panel.getWidth() - BALL_SIZE) {
                alpha = alpha + Math.PI - 2 * alpha;
            } else if (posX <= 0) {
                alpha = Math.PI - alpha;
            }
            if (posY >= panel.getHeight() - BALL_SIZE) {
                alpha = -alpha;
            } else if (posY <= 0) {
                alpha = -alpha;
            }
            paint(panel.getGraphics());
        }

    }
    
    private void paint(Graphics gr){
        gr.setColor(Color.BLUE);
        gr.fillOval(posX, posY, BALL_SIZE, BALL_SIZE);
        try {
            sleep(30);
        } catch (InterruptedException ex) {
            Logger.getLogger(BallThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        gr.setColor(panel.getBackground());
        gr.fillOval(posX, posY, BALL_SIZE, BALL_SIZE);
    }

}
