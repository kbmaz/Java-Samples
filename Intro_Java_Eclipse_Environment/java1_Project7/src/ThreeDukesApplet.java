import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class ThreeDukesApplet extends Applet {

    Dukes myDuke, yourDuke, theirDuke; //three declarations for Duke instances
    String myAction, yourAction, theirAction; //each will have their own action
    
    public void init() {
      myDuke=new Dukes();   
      yourDuke=new Dukes(); 
      theirDuke=new Dukes(); 
      
      
     resize(600,200); 
     
    }
    
    public void paint(Graphics g)
    {
      String action="";
      switch ((int) (Math.random() * 3))
      {
      case 0: action=myDuke.write(); action=yourDuke.write(); action=theirDuke.write(); break;
      case 1: action=myDuke.think(); action=yourDuke.think(); action=theirDuke.think(); break;
      case 2: action=myDuke.wave(); action=yourDuke.wave(); action=theirDuke.wave(); break;
      }
      
      Image myAction=getImage(getDocumentBase(), action); //get and show image for first Duke
      g.drawString(myDuke.getAction(), 10, 165);
      g.drawString(myDuke.getMessage(), 10, 180);
      g.drawImage(myAction, 20, 50, Color.white, this);
      
      Image yourAction=getImage(getDocumentBase(), action); //get and show image for second Duke
      g.drawString(yourDuke.getAction(), 200, 165);
      g.drawString(yourDuke.getMessage(), 200, 180);
      g.drawImage(yourAction, 200, 50, Color.white, this);
      
      Image theirAction=getImage(getDocumentBase(), action); //get and show image for third Duke
      g.drawString(theirDuke.getAction(), 400, 165);
      g.drawString(theirDuke.getMessage(), 400, 180);
      g.drawImage(theirAction, 400, 50, Color.white, this);
    }

  }

