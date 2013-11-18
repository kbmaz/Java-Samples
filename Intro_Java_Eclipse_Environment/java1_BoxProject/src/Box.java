import java.awt.Color;
import java.awt.Graphics;

public class Box {

  private int upperLeftX = 0;
  private int upperLeftY = 0;
  private int height = 50;
  private int width = 50;
  private Color boxColor;

  public Box(int upperX, int upperY, int h, int w, Color boxColor) {
    boxColor = setBoxColor(boxColor);
    height = setHeight(h);
    width = setWidth(w);
    upperLeftX = setUpperLeftX(upperX);
    upperLeftY = setUpperLeftY(upperY);

  }

  public void display(Graphics g) {
    g.setColor(boxColor);
    g.fillRect(upperLeftX, upperLeftY, width, height);
  }

  public int getUpperLeftX() {
    return upperLeftX;
  }

  public int setUpperLeftX(int upperLeftX) {
    return this.upperLeftX = upperLeftX;
  }

  public int getUpperLeftY() {
    return upperLeftY;
  }

  public int setUpperLeftY(int upperLeftY) {
    return this.upperLeftY = upperLeftY;
  }

  public int getHeight() {
    return height;
  }

  public int setHeight(int height) {
    return this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int setWidth(int width) {
    return this.width = width;
  }

  public Color getBoxColor() {
    return boxColor;
  }

  public Color setBoxColor(Color boxColor) {
    return this.boxColor = boxColor;
  }

}
