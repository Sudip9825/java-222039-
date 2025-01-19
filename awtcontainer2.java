import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class awtcontainer2 {
     public static void main(String[] args) {
        JFrame frame = new JFrame("flowlayout Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //crate a panel with flowlayout
        JPanel panel =new JPanel(new FlowLayout(FlowLayout.CENTER, 10,20));//
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("Button"));
        panel.add(new JButton("west button"),BorderLayout.WEST);
        // fraem.add(panel1);

         frame.add(panel);
         frame.setVisible(true);
     } 
}
// parctice containers