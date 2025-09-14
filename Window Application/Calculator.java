import java.awt.event.*;
import javax.swing.*;

class CalculatorNumbers implements ActionListener {
    JFrame frame;
    JTextField display;
    JButton[] numberButtons = new JButton[10]; // for digits 0–9

    public CalculatorNumbers() {
        frame = new JFrame("Number Pad");

        // Display field
        display = new JTextField();
        display.setBounds(50, 30, 300, 40);
        display.setEditable(false);

        // Create number buttons 0–9
        int x = 50, y = 100; 
        for (int i = 1; i <= 9; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setBounds(x, y, 60, 40);
            numberButtons[i].addActionListener(this);
            frame.add(numberButtons[i]);
 
            x += 70;
            if (i % 3 == 0) { // move to next row after 3 buttons
                x = 50;
                y += 50;
            }
        }

        // Button 0
        numberButtons[0] = new JButton("0");
        numberButtons[0].setBounds(120, y, 60, 40);
        numberButtons[0].addActionListener(this);
        frame.add(numberButtons[0]);

        // Add display
        frame.add(display);

        // Frame settings
        frame.setSize(420, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText() + i); // append digit
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorNumbers();
    } 
} 
