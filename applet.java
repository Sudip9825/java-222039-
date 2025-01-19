
import java.applet.Applet;
import java.awt.Graphics;
public class applet extends Applet{
        @Override
        public void paint(Graphics g) {
            g.drawString("Hello from the applet!", 20, 20);
        }
    }
