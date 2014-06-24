package greenDB;

import java.awt.event.*;
import javax.swing.*;

public class ExitListener extends JDialog implements ActionListener {
  PhoneBookFrame pbf;
  
  public ExitListener(PhoneBookFrame pbFrame) {
    pbf = pbFrame;
    setSize(200,100);
    JPanel main = new JPanel();
    
    JButton exitSave = new JButton("Exit & Save Table"); 
    exitSave.setActionCommand("EXIT_SAVE");
    exitSave.addActionListener(this);
    
    JButton exitDlt = new JButton("Exit & Delete Table");
    exitDlt.setActionCommand("EXIT_DELETE");
    exitDlt.addActionListener(this);
    
    main.add(exitSave);
    main.add(exitDlt);
    main.setVisible(true);
    
    this.add(main);
  }
  
  public void actionPerformed(ActionEvent e) {
    ExitListener exitL = new ExitListener(pbf);
    exitL.setVisible(true);
    
    String cmd = e.getActionCommand();
    if("EXIT_SAVE".equals(cmd)) {
      pbf.getDBManager().close(false);
      System.exit(0);
    }
    
    if("EXIT_DELETE".equals(cmd)) {
      pbf.getDBManager().close(false);
      System.exit(0); 
    }
  }
}
