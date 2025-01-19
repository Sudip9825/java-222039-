
    import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class Hotelform {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hotel detail forms");
    JPanel panel =new JPanel();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("file");
    JMenuItem menuItem1 = new JMenuItem("open");
    JMenuItem menuItem2 = new JMenuItem("close");
    JLabel nameLabel = new JLabel("Hotel Name:");
    JTextField nameTextField = new JTextField(16);
    nameTextField.setBounds(150,150,150,150);

    JLabel addressLabel = new JLabel("Hotel Address:");
    JTextField addressTextField = new JTextField(16);
    addressTextField.setBounds(200,200,150,150);
    
    JLabel emaiLabel = new JLabel("Email:");
    JTextField emaiTextField = new JTextField(16);
    emaiTextField.setBounds(250,250,150,150);
    
    JLabel phLabel = new JLabel("Phone no:");
    JTextField phTextField = new JTextField(16);
    phTextField.setBounds(300,300,150,150);
    
    JLabel desLabel = new JLabel("Description:");
    JTextField desTextField = new JTextField(16);
    desTextField.setBounds(350,350,150,150);
    
    JButton submiButton = new JButton("Submit");
    submiButton.setBounds(400,400,100,100);

    fileMenu.add(menuItem1);
    fileMenu.add(menuItem2);

    menuBar.add(fileMenu);

    panel.add(nameLabel);
    panel.add(addressLabel);
    panel.add(emaiLabel);
    panel.add(phLabel);
    panel.add(desLabel);
    panel.add(submiButton);

    panel.add(nameTextField);
    panel.add(addressTextField);
    panel.add(emaiTextField);
    panel.add(phTextField);
    panel.add(desTextField);
  

    frame.add(panel);


    frame.setJMenuBar(menuBar);
    frame.setSize(400,300);
    frame.setVisible(true);
  }
}

