import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Frame;
import java.awt.event.*;
public class EventHandler {
    public static void main(String[] args) {
        JFrame frame=new JFrame("event delegarion example");
        JButton button =new JButton("click me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"button clicked");
            }
        }
        );
        frame.add(button);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
