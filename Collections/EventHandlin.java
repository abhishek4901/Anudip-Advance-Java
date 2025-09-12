
 /*
  1. add event into compoment 
  addActionListener 
 2. Implement ActionListener
 3. implement method actionPerformed

 this program is event handling in swing when you click on button text field show hello world
 */
import java.awt.event.*;
import javax.swing.*;
 class EventHandling implements ActionListener{
    JFrame f1;
    JButton b1;
    JTextField t1;
    public EventHandling(){
        f1 = new JFrame("First GUI");
        b1 = new JButton("Click Me");
        t1 = new JTextField();
        t1.setBounds(100, 100, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 250, 250, 50);
        b1.addActionListener(this);
        t1.addActionListener(this);
        f1.add(b1);
        f1.add(t1);
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("Hello World");
    }
        
    public static void main(String[] args) {
        new EventHandling();
    }
 }
