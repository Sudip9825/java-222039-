import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import java.awt.event.*;

public class swingmenu {
  public static void main(String[] args) {
    JFrame frame = new JFrame("employee management system");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu=new JMenu("file");
    JMenuItem newfile = new JMenuItem("new");
    JMenuItem openFile = new JMenuItem("open");
    JMenuItem exit=new JMenuItem("exit");
    
    exit.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e){
        System.exit(0);
      }   
    });
    fileMenu.add(newfile);
    fileMenu.add(openFile);
    fileMenu.add(exit);

    JMenu helpmenu= new JMenu("helpme");
    JMenuItem newwelcome = new JMenuItem("welcome");
    JMenuItem newsupport = new JMenuItem("support");
    JMenuItem out = new JMenuItem("Exit");

    helpmenu.add(newwelcome);
    helpmenu.add(newsupport);
    helpmenu.add(out);

    menuBar.add(fileMenu);
    menuBar.add(helpmenu);
    frame.setJMenuBar(menuBar);
    frame.setSize(400,300);
    frame.setVisible(true);
  }
  
}