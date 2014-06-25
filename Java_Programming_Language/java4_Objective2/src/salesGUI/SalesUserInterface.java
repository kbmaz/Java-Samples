package salesGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SalesUserInterface extends JFrame {
  SalesApp app;
  JMenuBar mb;
  JMenu m, m1, data;
  JMenuItem q, r, s, t;
  static InputPanel inputPanel, previousInputPanel;
  JLabel peopleLabel;
  JTextField peopleField;
  JButton jbNumPeople, done;
  int numPeople;
  boolean processed;  
  
  public SalesUserInterface(SalesApp myApp) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app = myApp;
    app.setMyUserInterface(this);
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(600, 600));
    mb = new JMenuBar();
    setJMenuBar(mb);
    m = new JMenu("File");
    data = new JMenu("Options");
    mb.add(m);
    mb.add(data);
    data.add(r = new JMenuItem ("Reset"));
    data.add(s = new JMenuItem("Retrieve Previous"));
    data.add(t = new JMenuItem("Return"));
    m.add(q = new JMenuItem("Exit"));
    
    q.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
      
    r.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
            SalesUserInterface.this.revalidate();
      }     
    });
    
    s.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        inputPanel.setVisible(false);
        add(previousInputPanel);
        previousInputPanel.setVisible(true);
        SalesUserInterface.this.revalidate();
      }
    });
    
    t.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        previousInputPanel.setVisible(false);
        inputPanel.setVisible(true);
        SalesUserInterface.this.revalidate();
      }
    });
    
    InitPanel specifyNumber = new InitPanel();
    add("North", specifyNumber);
    
    pack();
    setVisible(true);
  }
  
  public void reset() {
    
  }
  public void retrievePrevious() {
    
  }
  public void returnTo() {
    
  }
  
  private class InitPanel extends JPanel{
    public InitPanel() {
      peopleLabel = new JLabel("Enter the number of sales people");
      add(peopleLabel);
      peopleField = new JTextField(5);
      add(peopleField);
      jbNumPeople = new JButton("Submit");
      add(jbNumPeople);
      jbNumPeople.addActionListener(new NumSalesPeopleListener());
    }
  }
  
  private class NumSalesPeopleListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      if(inputPanel != null) {
        previousInputPanel = inputPanel;
        remove(inputPanel);
        app = new SalesApp();
      }
      numPeople = Integer.parseInt(peopleField.getText());
      inputPanel = new InputPanel(app, numPeople, 2);
      add("Center", inputPanel);
      SalesUserInterface.this.validate();
    }
  }
}
