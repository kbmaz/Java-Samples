import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameTest extends Frame {

  public byte b = 125;
  public short s = 2;
  public int i = 10478;
  public long l = -5927835130L;
  public double d = 3.14;
  public float f = -54.5f;
  public char c = 'k';
  boolean kimberlyMirkes = true;
  public byte bb = -125;
  public short ss = -2;
  public int ii = -10478;
  public long ll = 5927835130L;
  public double dd = 5e14;
  public float ff = 54.5f;
  public char a = 'z';
  boolean mirkesKimberly = false;

  public String message;

  public FrameTest() {
    message = " byte=125, short=2, int=10478, long=-5,927,835,130, double=3.14, float=-54.5, char=k, kimberlyMirkes=true";

  }

  public void paint(Graphics g) {
    g.drawString(message, 50, 50);
    g.drawString("Click anywhere to Exit", 50, 70);
    System.out
        .print("byte=-125, short=-2, int=-10478, long=5927835130, double=500000000000000, float=54.5 floating point, char=z, mirkesKimberly=false");
  }

  public void start() {
    setSize(500, 500);
    setVisible(true);
    this.addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        setVisible(false);
        dispose();
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    FrameTest t;

    t = new FrameTest();
    t.start();

  }

}
