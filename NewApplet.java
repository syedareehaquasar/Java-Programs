import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author reeha
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setBackground(Color.black);
    }
//    
    public void paint(Graphics g){
 //set color to blue
 g.setColor(Color.blue);
 
 //print hello world
 g.drawString("Hello World...",100,100);
 
 showStatus("Syeda Reeha Quasar");
 }

    // TODO overwrite start(), stop() and destroy() methods
}
