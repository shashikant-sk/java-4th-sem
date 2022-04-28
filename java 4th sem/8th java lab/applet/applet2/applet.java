import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    Font boldFont, normieFont;

    public void init() {
        setForeground(Color.WHITE);
        setBackground(Color.YELLOW);
        boldFont = new Font("Arial", Font.BOLD, 16);
        normieFont = new Font("Arial", Font.PLAIN, 14);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(boldFont);
        g.drawString("Name: ", 5, 15);

        g.setColor(Color.BLACK);
        g.setFont(normieFont);
        g.drawString("HANS PATTNAIK", 80, 15);


        g.setColor(Color.RED);
        g.setFont(boldFont);
        g.drawString("Roll: ", 5, 30);

        g.setColor(Color.BLACK);
        g.setFont(normieFont);
        g.drawString("20051902", 80, 30);


        g.setColor(Color.RED);
        g.setFont(boldFont);
        g.drawString("Branch: ", 5, 45);

        g.setColor(Color.BLACK);
        g.setFont(normieFont);
        g.drawString("CSE", 80, 45);


        g.setColor(Color.RED);
        g.setFont(boldFont);
        g.drawString("Section: ", 5, 60);

        g.setColor(Color.BLACK);
        g.setFont(normieFont);
        g.drawString("CSE 26", 80, 60);
    }
}




