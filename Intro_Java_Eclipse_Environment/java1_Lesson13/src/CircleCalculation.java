import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CircleCalculation extends Applet implements ActionListener {

  private double radius;
  private double area;
  private TextField tf1;
  private TextField tf2;
 private boolean radiusGiven =true;

  public void init() {
    tf1 = new TextField(15);
    tf2 = new TextField(15);
    add(new Label("Radius"));
    add(tf1);
    add(new Label("Area"));
    add(tf2);

    tf1.addActionListener(this);
    tf2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    TextField temp = (TextField) e.getSource();
    if (temp == tf1) {
      radius = Double.parseDouble(temp.getText());
      area = Math.PI*radius*radius;
      tf2.setText(Double.toString(area));
      radiusGiven = true;
      
    }
    else
      if (temp == tf2) {
        area = Double.parseDouble(temp.getText());
        radius = Math.sqrt(area/Math.PI);
        tf1.setText(Double.toString(radius));
        radiusGiven = false;
      }

    repaint();
  }

  public void paint(Graphics g) {
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    if(radiusGiven) {
      
    g.drawString("Radius is " + nf.format(radius) + " Area is " + nf.format(area), 10, 100);
    // hint: area = Math.PI*radius*radius)
  }
    else {
      g.drawString("Area is " + nf.format(area) + " Radius is " + nf.format(radius), 10, 100);
    }
  }

  public void changeCalcArea() {
    area = Math.PI * radius * radius;
  }

  public void changeCalcRadius() {
    radius = Math.sqrt(area / Math.PI);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }
  
  public boolean isRadiusGiven() {
    return radiusGiven;
  }
  
  public void setRadiusGiven(boolean radiusGiven) {
    this.radiusGiven = radiusGiven;
  }

  public TextField getTf1() {
    return tf1;
  }

  public void setTf1(TextField tf1) {
    this.tf1 = tf1;
  }

  public TextField getTf2() {
    return tf2;
  }

  public void setTf2(TextField tf2) {
    this.tf2 = tf2;
  }
}