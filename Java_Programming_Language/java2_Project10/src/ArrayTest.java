import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ArrayTest extends Applet {
  Color color;
  Color[] colorArray = new Color[7];
  final int START_X=10;
  final int START_Y=10;
  final int BOX_WIDTH=30;
  final int BOX_HEIGHT=30;
  
  public void init() {
    generateColors();
    resize (300, 300);
  }
  public void generateColors() {
    colorArray[0]=Color.red; 
    colorArray[1]=Color.cyan; 
    colorArray[2]=Color.yellow; 
    colorArray[3]=Color.green; 
    colorArray[4]=Color.blue; 
    colorArray[5]=Color.black; 
    colorArray[6]=Color.pink; 
}
  public void paint (Graphics g) {
    for(int i=0; i<colorArray.length; i++) {
      g.setColor(colorArray[i]);
      g.fillRect(START_X + i * BOX_WIDTH, START_Y + i*BOX_HEIGHT, 30, 30); 
    }
    for (int i=0; i<colorArray.length; i++) {
      g.setColor(colorArray[i]);
      g.fillRect(START_X*7 + i * BOX_WIDTH, START_Y*7 + i * BOX_HEIGHT, 30, 30);
    }
    
       
    }
    
  }
  

