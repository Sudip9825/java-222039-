//import java.applet.Applet;
import java.awt.*;

public class awtcontainer extends Frame {
    
    // initializing using constructor
    awtcontainer(){
        //creating a button
        Button b=new Button("click Me!!!");
        //setting button position on screen
        b.setBounds(30,100, 80, 30);
        //adding button into frame
        add(b);
        // frame size 300 width and 300 height
        setSize(300,300);
        //settig the title of frame
        setTitle("this is our basic AWT example");
      //no layout manager
        setLayout(null);
        //now frame will be visible ,by default it is not visible
        setVisible( true);

    }
    // main method
    public static void main(String args[]){
        //creating instance of frame class
        awtcontainer f= new awtcontainer();

    }
}
