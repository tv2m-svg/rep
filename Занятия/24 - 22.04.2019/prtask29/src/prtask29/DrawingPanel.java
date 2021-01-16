package prtask29;

import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel
        implements MouseMotionListener, MouseListener {

    private List<List<Point>> curves;
    private List<Point> points;
    private Point prevPoint;

    public DrawingPanel() {
        super();
        points = new ArrayList<>();
        curves = new ArrayList<>();

        this.addMouseMotionListener(this);
        this.addMouseListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(7.0f));
        g2.setColor(Color.GREEN);
        for (List<Point> points : curves) {
            for (int i = 0; i < points.size() - 1; ++i) {
                g2.drawLine(points.get(i).x, points.get(i).y,
                        points.get(i + 1).x, points.get(i + 1).y);
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point curPoint = e.getPoint();
        points.add(curPoint);
        Graphics2D g2 = (Graphics2D) this.getGraphics();
        g2.setStroke(new BasicStroke(4.0f));
        g2.setColor(Color.RED); 
        g2.drawLine(prevPoint.x, prevPoint.y, curPoint.x, curPoint.y);
        prevPoint = curPoint;
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        prevPoint = e.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        curves.add(new ArrayList<Point>(points));
        points.clear();
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
