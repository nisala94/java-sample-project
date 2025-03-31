import java.applet.*;
import java.awt.*;
/*<applet code=AppletDemo width=500 height=800> 
</applet>
 */
public class AppletDemo extends Applet
{
 
    public void init()
    {
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
    }
    public void paint(Graphics g)
    {
        Color c=new Color(10,10,40);
        g.setColor(c);//first type of adding color
        g.setColor(Color.pink);//second type of adding color

        Font f=new Font("arial",1,10);
        g.setFont(f);//add fonts

        g.drawString("Welcome to Applet", 40, 40);

        int x[]={200,250,280,290,200};
        int y[]={100,250,280,290,300};
        g.drawPolygon(x,y,5);
        

    }
    
}
