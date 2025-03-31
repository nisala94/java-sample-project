import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet
{
 
    public void init()
    {
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
    }
    public void paint(Graphics g)
    {
        g.drawString("Welcome to Applet", 40, 40);
    }
    
}
