import java.util.Scanner;
import java.util.*;

import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;

public class OptionsMenu {
  
  String userInput;
  List<String> storedTextList = new ArrayList<String>();
  //String[] storedText = new String[100];
  Scanner in = new Scanner(System.in);

public void start() {
  
  while(true) {
    System.out.println("Click in the Console," 
        + "\n then Enter a command: (choose)"
        + "\n E (then Enter) to Enter text"
        + "\n S (then Enter) to Save text"
        + "\n R (then Enter) to Read text"
        + "\n Q (then Enter) to Quit the program.");
    
    userInput = in.nextLine();
    checkInputs(userInput);
  }
}
    public void checkInputs(String command) {
      
    if(command.charAt(0) == 'E') {
      enterText();
      /*try {
        FileWriter fStream = new FileWriter("textfile.txt");
        BufferedWriter output = new BufferedWriter(fStream);
        output.write("");
        output.close();
      } */
    }
    
    else if(command.charAt(0) == 'S') {
      saveText();
    }
    
    else if(command.charAt(0) == 'R') {
      readText();
    }
    
    else if(command.charAt(0) == 'Q'){
      quit();
    }
    
    else {
      System.out.println("Invalid command.  Please enter either E, S, R, or Q.");
    }
  }
    
    public void enterText() {
      
      System.out.println("Enter text: ");
      
      try {
        while(userInput != null) {
          storedTextList.add(userInput);
        }
        
      }catch(Exception e) {
        System.err.println("Error: " + e.getMessage());
      }
      return; //how do I say return to options menu?
    }
    
    public void saveText() {
      
      System.out.println("Enter file name to save text: ");
      //not sure how to create new file object based on file name given by user
      try {
        FileOutputStream fos = new FileOutputStream("output");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(storedTextList);
        oos.close();
      } catch(Exception e) {
        e.printStackTrace();
      }
      //How would I tell them their file has been saved successfully?
      
      /*Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      System.out.flush();
      String fileName = scanner.nextLine();
      File file = new File(fileName);*/
    }
    
    public void readText() {
      System.out.println("Enter file you wish to read: ");
      //if (//how do I allow them to type in their file name?)
          //file name != .txt{
          //error out
      try {
        FileInputStream fStream = new FileInputStream("textfile.txt");
        DataInputStream input = new DataInputStream(fStream);
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String strLine;
        
        while((strLine = br.readLine()) != null) {
          System.out.println(strLine);
        }
        input.close();
      } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
      }
      //not sure how to pop up a message that they can press any key to return to main menu
    }
    
    public void quit() {
      System.out.println("Program terminated.");
      System.exit(0);
    }

  public static void main(String[] args) {
    new OptionsMenu().start();  
  }
}
