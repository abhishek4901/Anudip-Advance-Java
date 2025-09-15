import javax.swing.*;
 class Cal{
    JFrame f1;
    JButton b1;
    JTextField t1;
    public Cal(){
        
        t1 = new JTextField();
        t1.setBounds(200, 100, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 100, 250, 50);
        b1.setBounds(100, 100, 250, 50);
        b1.setBounds(50, 100, 250, 50);

        t1.setBounds(200, 150, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 150, 250, 50);
        b1.setBounds(100, 150, 250, 50);
        b1.setBounds(50, 150, 250, 50);

        t1.setBounds(200, 200, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 200, 250, 50);
        b1.setBounds(100, 200, 250, 50);
        b1.setBounds(50, 200, 250, 50);

        t1.setBounds(200, 250, 150, 50);//x axixs, y axis, width, height
        b1.setBounds(150, 250, 250, 50);
        b1.setBounds(100, 250, 250, 50);
        b1.setBounds(50, 250, 250, 50);
        f1.add(b1);
        f1.add(t1);
        f1.setSize(500, 500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new Cal();
    }
 }


// import java.awt.*;
// import javax.swing.*;

// class Cal {
//     JFrame f1;
//     JButton[] buttons;
//     JTextField t1;

//     public Cal() {
//         f1 = new JFrame("Calculator");
//         t1 = new JTextField();
//         t1.setBounds(50, 30, 300, 40);

//         // Panel for buttons with 3x3 grid
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(3, 3, 10, 10)); // 3 rows, 3 cols, gaps = 10px

//         // Create 9 buttons
//         buttons = new JButton[9];
//         for (int i = 0; i < 9; i++) {
//             buttons[i] = new JButton(String.valueOf(i + 1)); // "1" to "9"
//             panel.add(buttons[i]);
//         }

//         panel.setBounds(50, 100, 300, 300); // position of button grid

//         // Add components
//         f1.add(t1);
//         f1.add(panel);

//         f1.setSize(400, 500);
//         f1.setLayout(null);
//         f1.setVisible(true);
//         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new Cal();
//     }
// }
