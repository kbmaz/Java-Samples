import java.applet.Applet;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Create a 4X4 grid of boxes. Create 16 instances of the Box class. */

public class Grid extends Applet implements ActionListener {

  Box Box1;
  Box Box2;
  Box Box3;
  Box Box4;
  Box Box5;
  Box Box6;
  Box Box7;
  Box Box8;
  Box Box9;
  Box Box10;
  Box Box11;
  Box Box12;
  Box Box13;
  Box Box14;
  Box Box15;
  Box Box16;
  Button button1;

  public void init() {
    button1 = new Button("Change Color");
    add(button1);
    button1.addActionListener(this);

    Box1 = new Box(0, 0, 50, 50, Color.darkGray);
    Box2 = new Box(50, 0, 50, 50, Color.yellow);
    Box3 = new Box(100, 0, 50, 50, Color.blue);
    Box4 = new Box(150, 0, 50, 50, Color.magenta);
    Box5 = new Box(0, 50, 50, 50, Color.green);
    Box6 = new Box(50, 50, 50, 50, Color.black);
    Box7 = new Box(100, 50, 50, 50, Color.pink);
    Box8 = new Box(150, 50, 50, 50, Color.cyan);
    Box9 = new Box(0, 100, 50, 50, Color.black);
    Box10 = new Box(50, 100, 50, 50, Color.orange);
    Box11 = new Box(100, 100, 50, 50, Color.white);
    Box12 = new Box(150, 100, 50, 50, Color.lightGray);
    Box13 = new Box(0, 150, 50, 50, Color.pink);
    Box14 = new Box(50, 150, 50, 50, Color.gray);
    Box15 = new Box(100, 150, 50, 50, Color.red);
    Box16 = new Box(150, 150, 50, 50, Color.cyan);
    resize(600, 300);
  }

  public void paint(Graphics g) {
    Box1.display(g);
    Box2.display(g);
    Box3.display(g);
    Box4.display(g);
    Box5.display(g);
    Box6.display(g);
    Box7.display(g);
    Box8.display(g);
    Box9.display(g);
    Box10.display(g);
    Box11.display(g);
    Box12.display(g);
    Box13.display(g);
    Box14.display(g);
    Box15.display(g);
    Box16.display(g);
  }

  public void actionPerformed(ActionEvent evt) {

    Box1.setBoxColor(Color.yellow);
    Box2.setBoxColor(Color.darkGray);
    Box3.setBoxColor(Color.magenta);
    Box4.setBoxColor(Color.blue);
    Box5.setBoxColor(Color.black);
    Box6.setBoxColor(Color.green);
    Box7.setBoxColor(Color.cyan);
    Box8.setBoxColor(Color.pink);
    Box9.setBoxColor(Color.orange);
    Box10.setBoxColor(Color.black);
    Box11.setBoxColor(Color.lightGray);
    Box12.setBoxColor(Color.white);
    Box13.setBoxColor(Color.gray);
    Box14.setBoxColor(Color.pink);
    Box15.setBoxColor(Color.cyan);
    Box16.setBoxColor(Color.red);

    repaint();
  }

}
