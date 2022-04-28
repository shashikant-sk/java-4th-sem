import java.awt.*;
import java.applet.*;

public class applet
        extends Applet {

    public void init() {
        setBackground(Color.GRAY);

        Label label = new Label("Test Label");
        label.setBackground(Color.ORANGE);
        this.add(label);

        TextField textBox = new TextField("Text Box", 30);
        this.add(textBox);

        Checkbox cb = new Checkbox("Check Box");
        cb.setBackground(Color.ORANGE);
        this.add(cb);

        CheckboxGroup rb = new CheckboxGroup();
        this.add(new Checkbox("Radio Button", rb, true));

        Button button = new Button("Button");
        button.setBackground(Color.ORANGE);
        this.add(button);

    }
}



