//this program will change in swing
/* window application - access only single application
   wep application -  online , no geograghical area.
   windoq appllication -  access only single application
    mobile application -  android , ios

                window       web application
front end(user interface) - AWt/Sweing.    htmml, css /react/ jsp/servlet/spring
back end (Data) - JDBC/hibernate  jdbc/hibernate/spring data

AWT (abstract window toolkit)  (container ke andr component ate hai)
 1. container -(who contain component) frame, dialog,window, panel
 2. components - (a single unit call component )button, label, textfield, textarea, checkbox, checkboxgroup,

 how to create frame 
 1. by extending frame class
    2. by using object of frame class
Note -- we import java.awt.*;  for awt
             -- we import javax.swing.*; for swing
             -- we import java.awt.event.*; for event handling
    step of creating  frame
    1. create object of
    component obj = new component();

    2.  extends frame class
    3. set positions of component
        setBounds(x axis, y axis, width, height)
    4. add component in to container
        container.add(component);
    5. call method of container
        setSize(width, height);
        setLayout(null);
        setVisible(true);   
    // this java awt program 
        import java.awt.*;//import javaX.swing.*;
        class FirstGui{
    Frame f1;
    Button b1;
    TextField t1;
    public FirstGui(){
        f1 = new Frame("First GUI");
        b1 = new Button("Click Me");
        t1 = new TextField();
        t1.setBounds(100, 100, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 250, 250, 50);
        f1.add(b1);
        f1.add(t1);
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstGui();
    }
}

*/


//THIS facical version of awt is swing
import javax.swing.*;
 class FirstGui{
    JFrame f1;
    JButton b1;
    JTextField t1;
    public FirstGui(){
        f1 = new JFrame("First GUI");
        b1 = new JButton("Click Me");
        t1 = new JTextField();
        t1.setBounds(100, 100, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 250, 250, 50);
        f1.add(b1);
        f1.add(t1);
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstGui();
    }
 }

