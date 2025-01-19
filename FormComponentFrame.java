import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;;
public class FormComponentFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel userJLabel =new JLabel("Username:");
    userJLabel.setBounds(50,50,70,50);
    JTextField usernameField = new JTextField(20);
    usernameField.setBounds(130,65,120,25);

    JLabel passwordJLabel = new JLabel("Password:");
    passwordJLabel.setBounds(50,80,70,50);
    JPasswordField passwordField = new JPasswordField(20);
    passwordField.setBounds(130,95,120,25);

    JLabel genderJLabel= new JLabel("Gender:");
    JRadioButton Gender = new JRadioButton("Male");
    JRadioButton Gender1 = new JRadioButton("Female");
    genderJLabel.setBounds(50,110,70,50);
    Gender.setBounds(130,110,70,50);
    Gender1.setBounds(195,110,70,50);
    ButtonGroup bGroup=new ButtonGroup();

    JComboBox cousreBox = new JComboBox();


    bGroup.add(Gender);
    bGroup.add(Gender1);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.add(userJLabel);
    frame.add(usernameField);
    frame.add(passwordField);
    frame.add(passwordJLabel);
    frame.add(genderJLabel);
    frame.add(Gender1);
    frame.add(Gender);
    
  }
}

