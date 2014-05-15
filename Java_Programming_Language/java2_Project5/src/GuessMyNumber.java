import java.util.Scanner;

public class GuessMyNumber {

  Scanner scan;
  double weight;
  double Calories = weight * 14;
  double grams = weight * 453.59237;

  public GuessMyNumber() {
    scan = new Scanner(System.in);
  }

  public void testMe() {
    getInput();
    getOutput();
    // calls to methods you make
  }

  public void getInput() {
    // prompt the user for input
    System.out.println("Click in the Console");
    System.out.print("Type in your weight and hit enter: ");
    weight = scan.nextDouble();
  }

  public void getOutput() {
    Calories = weight * 14;
    System.out.println("To sustain your current weight, you need " + Calories
        + " calories per day. ");
    grams = weight * 453.59237;
    System.out.print("You would weigh " + grams + " in grams.");
  }

  public static void main(String[] args) {
    GuessMyNumber myGame = new GuessMyNumber();
    myGame.testMe();
  }

}