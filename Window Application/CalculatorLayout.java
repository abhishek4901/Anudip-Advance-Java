import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;

class CalculatorLayout implements ActionListener {
    JFrame f;
    JTextField t;
    JButton[] b;

    // Labels for the 16 calculator buttons
    String[] labels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };

    public CalculatorLayout() {
        f = new JFrame("Calculator");
        t = new JTextField();
        t.setBounds(30, 30, 280, 40);
        t.setEditable(false); // user should not type manually
        f.add(t);

        b = new JButton[16];
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(labels[i]);
            b[i].addActionListener(this);
        }

        // Row 1
        b[0].setBounds(30, 100, 60, 40);   // 7
        b[1].setBounds(100, 100, 60, 40);  // 8
        b[2].setBounds(170, 100, 60, 40);  // 9
        b[3].setBounds(240, 100, 60, 40);  // /

        // Row 2
        b[4].setBounds(30, 150, 60, 40);   // 4
        b[5].setBounds(100, 150, 60, 40);  // 5
        b[6].setBounds(170, 150, 60, 40);  // 6
        b[7].setBounds(240, 150, 60, 40);  // *

        // Row 3
        b[8].setBounds(30, 200, 60, 40);   // 1
        b[9].setBounds(100, 200, 60, 40);  // 2
        b[10].setBounds(170, 200, 60, 40); // 3
        b[11].setBounds(240, 200, 60, 40); // -

        // Row 4
        b[12].setBounds(30, 250, 60, 40);  // 0
        b[13].setBounds(100, 250, 60, 40); // .
        b[14].setBounds(170, 250, 60, 40); // =
        b[15].setBounds(240, 250, 60, 40); // +

        // Add all buttons to the frame
        for (int i = 0; i < 16; i++) {
            f.add(b[i]);
        }

        // Frame setup
        f.setSize(350, 370);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 16; i++) {
            if (e.getSource() == b[i]) {
                if (b[i].getText().equals("=")) {
                    try {
                        // Evaluate the expression
                        ScriptEngineManager mgr = new ScriptEngineManager();
                        ScriptEngine engine = mgr.getEngineByName("JavaScript");
                        String result = engine.eval(t.getText()).toString();
                        t.setText(result);
                    } catch (Exception ex) {
                        t.setText("Error");
                    }
                } else {
                    // Append button text to field
                    t.setText(t.getText().concat(b[i].getText()));
                }
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorLayout();
    }
}
