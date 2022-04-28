import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    Image img;
    Font boldFont;

    public void init() {
        setForeground(Color.WHITE);
        setBackground(Color.GRAY);
        img = getImage(getDocumentBase(), "rickroll.jpg");
        boldFont = new Font("Arial", Font.BOLD, 18);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.setFont(boldFont);
        g.drawString("Example of Drawing Image", 260, 120);
        g.drawImage(img, 200, 150, this);
    }
}




