import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class IfStatement extends Applet {

  Color myColor = Color.orange;
  Color instructorColor = Color.blue;
  
      

  public void paint(Graphics g) {
    if (myColor == instructorColor) {
      g.drawString("These favorite colors match", 10, 20);
    }
    else  {
      g.drawString("These favorite colors do not match", 10, 20);
    
    
  }
}
}



