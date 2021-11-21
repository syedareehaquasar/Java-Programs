import java.applet.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author reeha
 */
public class NewApplet extends JApplet{

    /**
     * Initialization method that will be called after the applet is loaded into the
     * browser.
     */
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        // set color to blue
        g.setColor(Color.blue);

        // print hello world
        g.drawString("Hello World...", 100, 100);

        showStatus("Syeda Reeha Quasar");
    }
}
