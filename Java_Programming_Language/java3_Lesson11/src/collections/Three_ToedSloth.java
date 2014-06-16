package collections;

public class Three_ToedSloth extends Mammal {
  private double runningSpeed = 0.15;
  private double height = 0.58;
  
  public Three_ToedSloth(String who) {
    super(who);
  }

  public double getHeight() {
    return height;
  }

  public double getSpeed() {
    return runningSpeed;
  }

}
