import java.applet.Applet;
import java.awt.*;

public class DrawTest extends Applet {
  public void init() {
    
    resize(600,300);
  }
  public void paint(Graphics g) {
   Cartman myCartman = new Cartman(g);
   myCartman.drawMe();
  }
}

