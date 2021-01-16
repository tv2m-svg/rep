
package prtask35;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class DrawingPanel extends JPanel implements KeyListener{
    
    private List<Point> points = new ArrayList<>();
    private int dx = 10, dy = 10;
    private Point curPoint = new Point(100,100);
    private Color color = Color.BLUE;

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    

    public DrawingPanel() {
        points.add(curPoint);
        this.addKeyListener(this);
        this.setFocusable(true);
        
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        for(int i=0; i<points.size()-1; ++i){
            g.drawLine(points.get(i).x,points.get(i).y,
                    points.get(i+1).x,points.get(i+1).y);
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        Point newPoint;
        switch(keyCode){
            case KeyEvent.VK_RIGHT:{
                newPoint = new Point(curPoint.x+dx, curPoint.y);
                points.add(newPoint);
                curPoint = newPoint;
                this.repaint();
                break;
            }
            case KeyEvent.VK_LEFT:{
                newPoint = new Point(curPoint.x-dx, curPoint.y);
                points.add(newPoint);
                curPoint = newPoint;
                this.repaint();
                break;
            }
            case KeyEvent.VK_UP:{
                newPoint = new Point(curPoint.x, curPoint.y-dy);
                points.add(newPoint);
                curPoint = newPoint;
                this.repaint();
                break;
            }
            case KeyEvent.VK_DOWN:{
                newPoint = new Point(curPoint.x, curPoint.y+dy);
                points.add(newPoint);
                curPoint = newPoint;
                this.repaint();
                break;
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
