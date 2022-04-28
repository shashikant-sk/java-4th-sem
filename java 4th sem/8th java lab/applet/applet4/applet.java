import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    public void init() {
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
    }

    public void paint(Graphics g) {
        int xoff = 300, yoff = 200;

        g.setColor(Color.orange);
        g.fillOval(xoff, yoff, 150, 150);

        g.setColor(Color.white);
        g.fillOval(30 + xoff, 25 + yoff, 40, 50);
        g.fillOval(80 + xoff, 25 + yoff, 40, 50);

        g.setColor(Color.black);
        g.fillOval(45 + xoff, 40 + yoff, 20, 30);
        g.fillOval(85 + xoff, 40 + yoff, 20, 30);

        g.setColor(Color.red);
        g.fillArc(40 + xoff, 75 + yoff, 70, 50, 180, 180);
    }
}


