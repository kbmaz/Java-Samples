import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Potentials extends Applet implements ActionListener {
  
  private TextField birthYearField;
  private int birthYear;
  Scanner scan;
  Calendar rightNow; 
  
  public void init() {
    birthYearField=new TextField(2);
    add(birthYearField);
    birthYearField.addActionListener(this);
    Calendar rightNow = Calendar.getInstance();
    rightNow.get(Calendar.YEAR);
    resize (800, 300);
    
  }
  
  public void paint(Graphics g) {
    
    g.drawString("Type your year of birth", 5, 80);
    if (birthYear >= 2003) {
      g.drawString ("Hey newbie; you're under 10!  You have a lot of growing to do.", 5, 100);}
    else if (birthYear >= 1993) {
      g.drawString ("You're in your second decade! You have some freedom now, with that driver's license.", 5, 100); }
    else if (birthYear >=1983) {
      g.drawString ("You should be on your way to your first career, in your third decade!  Enjoy your twenties!", 5, 100); }
    else if (birthYear >= 1973) {
      g.drawString ("30s are the new 20s, so what are you worried about?  Enjoy life in your 4th decade!", 5, 100);}
    else if (birthYear >= 1963) {
      g.drawString ("Are you ready to try a new career, move to a different city?  There's still much to do in your 40s!", 5, 100);}
    else if (birthYear >= 1953) {
      g.drawString ("Ah the nifty fifties!  Time to see your kids move on to college, married life, maybe some grandkids for you?", 5, 100); }
    else if (birthYear >= 1943) {
      g.drawString ("Your seventh decade should bring much needed leisure in retirement & travel!  Don't delay!", 5, 100); }
    else if (birthYear >= 1933) {
      g.drawString ("The seventies; a time to look up past friends, pick up a new hobby, and watch your grandkids grow!", 5, 100); }
    else if (birthYear >= 1923) {
      g.drawString ("Hey octogenarian!  Celebrate your accomplishments and pass on your much needed knowledge to the younger generation-volunteer!", 5, 100); }
    else if (birthYear >= 1913) {
      g.drawString ("Your life is full of great things. You're in your 10th decade!!  Carpe Diem!", 5, 100); }
    else if (birthYear >= 1903) {
      g.drawString("You made it to 100; hello Willard Scott!", 5, 100); }
    }
    
    public void actionPerformed(ActionEvent event) {
      if(event.getSource()==birthYearField)
        birthYear=Integer.parseInt(birthYearField.getText());
      repaint();
    }
  }

