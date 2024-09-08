/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author sifu
 */
public class GreetingsGUI extends JFrame {
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nametxtFld;
    private JTextField surnameTxtFld;
    
    // text area
    private JTextArea greetingsTxtArea;
    
    //buttons 
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    
   public GreetingsGUI()
   {
    setLayout(new BorderLayout());
    setTitle("Greetings UI");
    setSize(700,750);
    setBackground(Color.YELLOW);
  
    
     //creatings panels
     namePnl = new JPanel(new FlowLayout());
     surnamePnl = new JPanel(new BorderLayout());
     
     nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
     
     greetingsAreaPnl = new JPanel(new FlowLayout());
     greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
     
     btnsPnl = new JPanel(new FlowLayout());
     mainPnl = new JPanel(new BorderLayout());
     
     headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
     headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
     
     
     //creating labels
     headingLbl = new JLabel("Greetings App");
     nameLbl = new JLabel("Name:  ");
     surnameLbl = new JLabel("Surname");
     
     //creating text field
      nametxtFld = new JTextField(20);
      surnameTxtFld = new JTextField(20);
      
      //create the text area 
      greetingsTxtArea = new JTextArea(40,50);
      greetingsTxtArea.setEditable(false);
      greetingsTxtArea.setText("Hello [name]  [surname]");
      
      
      //create buttons
      greetBtn = new JButton("Greet");
      clearBtn = new JButton("Clear");
      exitBtn = new JButton("Exit");
      
      //add name lable textfield to the name panel
      namePnl.add(nameLbl);
      namePnl.add(nametxtFld);
      
      //add surname label and textfield
      surnamePnl.add(surnameLbl);
      surnamePnl.add(surnameTxtFld);
      
      
      //add  the name and surname  panel to the collective panel
      nameAndSurnamePnl.add(namePnl);
      nameAndSurnamePnl.add(surnamePnl);
      
      
      //add the greetings area to the panel
      greetingsAreaPnl.add(greetingsTxtArea);
      
      //add buttons to their panel
      btnsPnl.add(greetBtn);
      btnsPnl.add(clearBtn);
      btnsPnl.add(exitBtn);
      
      
      mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
      mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
      mainPnl.add(btnsPnl,BorderLayout.SOUTH);
      
      
      
      //add the main panel to the frame's panel
      add(headingPnl,BorderLayout.NORTH);
      add(mainPnl,BorderLayout.SOUTH);
      
      
      setVisible(true);
      
     
     
     
       
   
   
   
   }
    
}
