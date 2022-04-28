import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    Font f;

    public void init() {
        setForeground(Color.WHITE);
        setBackground(Color.cyan);
        f = new Font("Arial", Font.BOLD, 28);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(f);
        g.drawString("GOOD AFTERNOON!", 250, 300);
    }
}