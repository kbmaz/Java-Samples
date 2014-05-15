import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ArrayTest extends Applet {
  Color color;
  Color[] colorArray = new Color[8];
  
  public void init() {
    generateColors();
  }
  public void generateColors() {
  colorArray[0]=Color.red;
  colorArray[1]=Color.orange;
  colorArray[2]=Color.yellow;
  colorArray[3]=Color.green;
  colorArray[4]=Color.blue;
  colorArray[5]=Color.white;
  colorArray[6]=Color.pink;
  colorArray[7]=Color.black;
}
  public void paint (Graphics g) {
    g.fillRect(0, 0, 30, 30); g.setColor(colorArray[0]);
    g.fillRect(0, 30, 30, 30); g.setColor(colorArray[1]);
    g.fillRect(0, 60, 30, 30); g.setColor(colorArray[2]);
    g.fillRect(0, 90, 30, 30); g.setColor(colorArray[3]);
    g.fillRect(30, 0, 30, 30); g.setColor(colorArray[4]);
    g.fillRect(30, 30, 30, 30); g.setColor(colorArray[5]);
    g.fillRect(30, 60, 30, 30); g.setColor(colorArray[6]);
    g.fillRect(30, 90, 30, 30); g.setColor(colorArray[7]);
    
  }
  
}
