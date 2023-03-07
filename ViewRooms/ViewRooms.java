
/**
 * Write a description of class ViewRooms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;


import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class ViewRooms implements ActionListener{
 
 private JFrame frame = new JFrame();
 private JButton kingBedButton = new JButton();
 private JButton queenBedButton = new JButton();
 private JButton suiteBedButton = new JButton();
 
 private JPanel panel;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private String Roomname;
    private String imageName;
   
 ViewRooms(){
  
       ImageIcon kingImage = new ImageIcon("king.png");
        ImageIcon queenImage = new ImageIcon("queen.png");
        ImageIcon suiteImage = new ImageIcon("suitecover.png");
        JLabel kingLabel = new JLabel();
        JLabel queenLabel = new JLabel();
        JLabel suiteLabel = new JLabel(); 
      
        
        kingLabel.setIcon(kingImage);
        queenLabel.setIcon(queenImage);
        suiteLabel.setIcon(suiteImage); 
       
        
        kingLabel.setVerticalAlignment(JLabel.TOP); //24:11
        queenLabel.setVerticalAlignment(JLabel.TOP);
        suiteLabel.setVerticalAlignment(JLabel.TOP);
        kingLabel.setHorizontalAlignment(JLabel.LEFT);
        queenLabel.setHorizontalAlignment(JLabel.LEFT);
        suiteLabel.setHorizontalAlignment(JLabel.LEFT);
        kingLabel.setBounds(100,50,500,500);
        queenLabel.setBounds(100,350,500,500);
        suiteLabel.setBounds(100,650,500,500);
        
        frame.setTitle(" HOTEL rooms");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,2000);
        frame.setLayout(null);
        frame.setVisible(true);
        //pack 29:00
        frame.add(kingLabel); // add label to gui
        frame.add(queenLabel);
        frame.add(suiteLabel);
        frame.getContentPane().setBackground(Color.white);
        
        
        kingBedButton.setBounds(550,210,100,50);
        kingBedButton.setText("KING Bedroom");
        frame.add(kingBedButton);
        
        
        queenBedButton.setBounds(550,450,150,50);
        queenBedButton.setText("Queen Bedroom");
        frame.add(queenBedButton);
        
        
        suiteBedButton.setBounds(550,750,150,50);
        suiteBedButton.setText("suite");
        frame.add(suiteBedButton);
        

  
  kingBedButton.setFocusable(false);
  kingBedButton.addActionListener(this);
  
  queenBedButton.setFocusable(false);
  queenBedButton.addActionListener(this);
  
  suiteBedButton.setFocusable(false);
  suiteBedButton.addActionListener(this);
  
 
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  frame.setLayout(null);
  frame.setVisible(true);
  
 }
 public void ViewRoom(String RoomName, String ImageName){
      Roomname = RoomName;
      imageName = ImageName;
  
  
  frame = new JFrame(Roomname);
        panel = new JPanel();
        
        
     ImageIcon image = new ImageIcon(imageName);
        
        JLabel label = new JLabel();
        
        label.setIcon(image);
        
        frame.add(label);
        
        scrollPane = new JScrollPane(label);
        
        

        
        panel.setLayout(new BorderLayout());

        
        panel.add(scrollPane, BorderLayout.CENTER);

        
        frame.add(panel);

     
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  
 }
 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==kingBedButton) {
   //frame.dispose();
   ViewRoom("room1","kingphotos.png");
  }
  if(e.getSource()==queenBedButton) {
   //frame.dispose();
   ViewRoom("room2","queenphotos.png");
  }
  if(e.getSource()==suiteBedButton) {
   //frame.dispose();
   ViewRoom("room3","suitephotos.png");
  }
 }
}
