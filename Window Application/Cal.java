import java.awt.event.*;
import javax.swing.*;

class Cal implements ActionListener {
    JFrame f1;
    JTextField t1;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton add, sub, mul, div, eq, clr;

    double num1, num2, result;
    char operator;

    public Cal() {
        f1 = new JFrame("Calculator");

        // Display
        t1 = new JTextField();
        t1.setBounds(50, 40, 300, 50);
        t1.setEditable(false);
        f1.add(t1);

        // Row 1
        b7 = new JButton("7"); b7.setBounds(50, 100, 60, 40);
        b8 = new JButton("8"); b8.setBounds(120, 100, 60, 40);
        b9 = new JButton("9"); b9.setBounds(190, 100, 60, 40);
        div = new JButton("/"); div.setBounds(260, 100, 60, 40);

        // Row 2
        b4 = new JButton("4");
         b4.setBounds(50, 150, 60, 40);
        b5 = new JButton("5");
         b5.setBounds(120, 150,
          60, 40);
        b6 = new JButton("6");
         b6.setBounds(190, 150, 60, 40);
        mul = new JButton("*");
         mul.setBounds(260, 150, 60, 40);

        // Row 3
        b1 = new JButton("1"); b1.setBounds(50, 200, 60, 40);
        b2 = new JButton("2"); b2.setBounds(120, 200, 60, 40);
        b3 = new JButton("3"); b3.setBounds(190, 200, 60, 40);
        sub = new JButton("-"); sub.setBounds(260, 200, 60, 40);

        // Row 4
        b0 = new JButton("0"); b0.setBounds(50, 250, 60, 40);
        clr = new JButton("C"); clr.setBounds(120, 250, 60, 40);
        eq = new JButton("="); eq.setBounds(190, 250, 60, 40);
        add = new JButton("+"); add.setBounds(260, 250, 60, 40);

        // Add all components
        JButton[] allBtns = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,
                             add,sub,mul,div,eq,clr};
        for(JButton b : allBtns){
            f1.add(b);
            b.addActionListener(this);
        }

        // Frame settings
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Digit buttons
        if(src == b0) t1.setText(t1.getText() + "0");
        if(src == b1) t1.setText(t1.getText() + "1");
        if(src == b2) t1.setText(t1.getText() + "2");
        if(src == b3) t1.setText(t1.getText() + "3");
        if(src == b4) t1.setText(t1.getText() + "4");
        if(src == b5) t1.setText(t1.getText() + "5");
        if(src == b6) t1.setText(t1.getText() + "6");
        if(src == b7) t1.setText(t1.getText() + "7");
        if(src == b8) t1.setText(t1.getText() + "8");
        if(src == b9) t1.setText(t1.getText() + "9");

        // Clear
        if(src == clr) {
            t1.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }

        // Operator buttons
        if(src == add) { num1 = Double.parseDouble(t1.getText()); operator = '+'; t1.setText(""); }
        if(src == sub) { num1 = Double.parseDouble(t1.getText()); operator = '-'; t1.setText(""); }
        if(src == mul) { num1 = Double.parseDouble(t1.getText()); operator = '*'; t1.setText(""); }
        if(src == div) { num1 = Double.parseDouble(t1.getText()); operator = '/'; t1.setText(""); }

        // Equal button
        if(src == eq) {
            num2 = Double.parseDouble(t1.getText());
            switch(operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if(num2 != 0) result = num1 / num2; 
                    else { t1.setText("Error"); return; }
                    break;
            }
            t1.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new Cal();
    }
}
