import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends Applet {
  
  //keep track of boxes that have been matched
  private boolean matchedBoxes[][]; 
  
  //keep track of two boxes that have been clicked
  private MaskableBox chosenBoxes[]; 
                                     
  private final int START_X = 20;
  private final int START_Y = 40;
  private final int ROWS = 4;
  private final int COLS = 4;
  private final int BOX_WIDTH = 20;
  private final int BOX_HEIGHT = 20;

  private MaskableBox boxes[][];
  private Color boxColors[][];

  private Button resetButton;

  public void init() {
    boxes = new MaskableBox[ROWS][COLS];
    boxColors = new Color[ROWS][COLS];
    resetButton = new Button("reset Colors");
    resetButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        randomizeColors();
        buildBoxes();
        repaint();
      }
    });
    add(resetButton);
    randomizeColors();
    buildBoxes();
  }

  public void paint(Graphics g) {
    // loop through the boxes rows
    for (int row = 0; row < boxes.length; row++) {
      // loop through each rows columns.
      for (int col = 0; col < boxes[row].length; col++) {
        // if we are at a clicked box.
        if (boxes[row][col].isClicked()) {
          // unclick it.
          boxes[row][col].setClicked(false);
          // only do game logic on boxes that haven't been matched.
          if (!matchedBoxes[row][col]) {
            gameLogic(boxes[row][col]);
          }
        }
      }
    }
    // loop through the boxes and draw them.
    for (int row = 0; row < boxes.length; row++) {
      for (int col = 0; col < boxes[row].length; col++) {
        boxes[row][col].draw(g);
      }
    }
  }

  private void removeMouseListeners() {
    for (int row = 0; row < boxes.length; row++) {
      for (int col = 0; col < boxes[row].length; col++) {
        removeMouseListener(boxes[row][col]);
      }
    }
  }

  private void buildBoxes() {
    // need to clear any chosen boxes when building new array.
    chosenBoxes = new MaskableBox[2];
    // create a new matchedBoxes array.
    matchedBoxes = new boolean[ROWS][COLS];
    removeMouseListeners();
    for (int row = 0; row < boxes.length; row++) {
      for (int col = 0; col < boxes[row].length; col++) {
        boxes[row][col] = new MaskableBox(START_X + col * BOX_WIDTH, START_Y + row * BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT,
            Color.gray, boxColors[row][col], true, true, this);
        addMouseListener(boxes[row][col]);
      }
    }
  }

  private void randomizeColors() {
    int[] chosenColors = { 0, 0, 0, 0, 0, 0, 0, 0 };
    Color[] availableColors = { Color.red, Color.blue, Color.green, Color.yellow, Color.cyan, Color.magenta, Color.pink,
        Color.orange };
    for (int row = 0; row < boxes.length; row++) {
      for (int col = 0; col < boxes[row].length; col++) {
        for (;;) {
          int rnd = (int) (Math.random() * 8);
          if (chosenColors[rnd] < 2) {
            chosenColors[rnd]++;
            boxColors[row][col] = availableColors[rnd];
            break;
          }
        }
      }
    }
  }

 public void gameLogic(MaskableBox box) {
    if ((chosenBoxes[0] != null) && (chosenBoxes[1] != null)) {
      if (chosenBoxes[0].getBackColor() == chosenBoxes[1].getBackColor()) {
        for (int i=0; i < chosenBoxes.length; i++) {
          for (int row = 0; row < boxes.length; row++) {
            for (int col = 0; col < boxes[row].length; col++) {
              if (boxes [row][col] == chosenBoxes[i]) {
                matchedBoxes[row][col] = true;
                break;
              }
            }
          }
        }
      }
    
    // the background colors do not match set both chosenBoxes mask value to
    // true
    else {
      chosenBoxes[0].setMask(true);
      chosenBoxes[1].setMask(true);
    }
    // reset the chosenBoxes array elements to null, set the chosenBoxes array
    // to equal a new array of size 2
    
      
    
    chosenBoxes = new MaskableBox[2];
    }
    // if the first index chosenBoxes is null
    if (chosenBoxes[0] == null) {
      // set the first chosenBoxes equal to the parameter of the method
      chosenBoxes[0] = box;
      // set its mask value to false
      chosenBoxes[0].setMask(false);
      // return out of method
      return;
    }
    // else if the second index chosenBoxes is null
    else {
      if (chosenBoxes[1] == null) {
        // set the second chosenBoxes equal to the parameter of the method
        chosenBoxes[1] = box;
        // set its mask value to false
        chosenBoxes[1].setMask(false);
        // return out of method
        return;
      }

    }
  }
}
