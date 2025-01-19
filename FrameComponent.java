
    import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;;
public class FrameComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setVisible(true);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel userJLabel =new JLabel("UserName:");
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
    genderJLabel.setBounds(50,120,70,25);
    Gender.setBounds(130,120,70,25);
    Gender1.setBounds(195,120,70,25);
    ButtonGroup bGroup=new ButtonGroup();

    String course[] = {"BCA","BBA","BIT"};
    JComboBox cousreBox = new JComboBox<>(course);
    JLabel cousrLabel = new JLabel("Course");
    cousrLabel.setBounds(50,150,70,25);
    cousreBox.setBounds(130, 150, 70, 25);

    
    JCheckBox saveBox = new JCheckBox("save password");
    saveBox.setBounds(130,180,150,25);



    bGroup.add(Gender);
    bGroup.add(Gender1);
    frame.add(userJLabel);
    frame.add(usernameField);
    frame.add(passwordField);
    frame.add(passwordJLabel);
    frame.add(genderJLabel);
    frame.add(Gender1);
    frame.add(Gender);
    frame.add(cousrLabel);
    frame.add(cousreBox);
    frame.add(saveBox);
  
  }
}


