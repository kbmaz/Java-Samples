import java.awt.*;

/* Introduction to Graphics */

public class Cartman {
  Graphics g; 
  
  public Cartman(Graphics graph) { 
    this.g=graph; 
  }
  
  public void drawMe() {
    g.setColor(Color.pink);
    g.fillOval(200, 50, 180, 150); //Cartman's face
    
    g.setColor(Color.white);
    g.fillOval(255, 73, 35, 53); //Cartman's eyes
    g.fillOval(290, 73, 35, 53);
    
    g.setColor(Color.black); //Cartman's eyeballs
    g.fillOval(276, 90, 3, 3);
    g.fillOval(295, 90, 3, 3);
    
    g.setColor(Color.black); //Cartman's mouth
    int[]xValues= {270,290,320};
    int[]yValues= {140,160,140};
    Polygon shapeThing=new Polygon(xValues, yValues, 3);
    g.fillPolygon(shapeThing);
    
    g.setColor(Color.white); //Cartman's teeth
    g.fillRect(275, 140, 8, 5);
    g.fillRect(284, 140, 10, 5);
    g.fillRect(297, 140, 10, 6);
    g.fillRect(309, 140, 7, 3);
    
    g.setColor(Color.cyan);//Cartman's hat
    g.fillArc(225, 50, 130, 50, 0, 180);
    g.setColor(Color.yellow);
    g.fillArc(225, 70, 130, 10, 0, 180);
    
  } 
  
} 
