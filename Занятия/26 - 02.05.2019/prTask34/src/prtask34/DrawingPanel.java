
package prtask34;

import java.awt.*;
import javax.swing.*;


public class DrawingPanel extends JPanel {

    static final int BORDER_WIDTH = 30;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension dim = this.getSize();
        int w = (dim.width - 2 * BORDER_WIDTH) / 8;
        int h = (dim.height - 2 * BORDER_WIDTH) / 8;
        for (int i = 0; i < 8; ++i) {
            g.setColor(Color.BLACK);
            g.drawString("" + (8 - i), BORDER_WIDTH / 2, BORDER_WIDTH + i * h + w / 2);
            for (int j = 0; j < 8; ++j) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.BLUE);
                }
                g.fillRect(BORDER_WIDTH + j * w, BORDER_WIDTH + i * h, w, h);
            }
        }
        g.setColor(Color.BLACK);
        for (int j=0; j<8;++j){
            g.drawString("" + (char)('a'+j), BORDER_WIDTH+w/2+w*j, dim.height-BORDER_WIDTH/2);
        }

    }

}
