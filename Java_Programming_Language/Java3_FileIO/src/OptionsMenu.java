import java.util.Scanner;

import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;

public class OptionsMenu {

public void start() {
  
  Scanner in = new Scanner(System.in);
  
  while(true) {
    System.out.println("Click in the Console," 
        + "\n then Enter a command: (choose)"
        + "\n E (then Enter) to Enter text"
        + "\n S (then Enter) to Save text"
        + "\n R (then Enter) to Read text"
        + "\n Q (then Enter) to Quit the program.");
    
    String command = in.nextLine();
    
    
    if(command.charAt(0) == 'E') {
      try {
        FileWriter fStream = new FileWriter("textfile.txt");
        BufferedWriter output = new BufferedWriter(fStream);
        output.write("");
        output.close();
      } catch(Exception e) {
        System.err.println("Error: " + e.getMessage());
      }
    }
    
    else if(command.charAt(0) == 'S') {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      System.out.flush();
      String fileName = scanner.nextLine();
      File file = new File(fileName);
    }
    
    else if(command.charAt(0) == 'R') {
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
    }
    
    else if(command.charAt(0) == 'Q'){
      System.out.println("Program terminated.");
      System.exit(0);
    }
    
    else {
      System.out.println("Invalid command.  Please enter either E, S, R, or Q.");
    }
  }
}

  public static void main(String[] args) {
    new OptionsMenu().start();  
  }
}
