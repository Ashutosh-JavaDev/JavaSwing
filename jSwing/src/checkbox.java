import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox implements ActionListener {
    JFrame frame;
    JButton button;
    JLabel label;
    JCheckBox checkboxone, checkboxtwo, checkboxthree;

    public checkbox() {
        frame = new JFrame("This is Jframe box");
        label = new JLabel("Food Items");
        label.setBounds(50, 50, 100, 20);
        checkboxone = new JCheckBox("Pizza 100");
        checkboxone.setBounds(50, 100, 150, 30);
        checkboxtwo = new JCheckBox("Burger 100");
        checkboxtwo.setBounds(50, 150, 150, 30);
        checkboxthree = new JCheckBox("Tea 40");
        checkboxthree.setBounds(50, 200, 150, 30);
        button = new JButton("Check Total");
        button.setBounds(50, 250, 150, 20);
        button.addActionListener(this);
        frame.add(button);
        frame.add(label);
        frame.add(checkboxone);
        frame.add(checkboxtwo);
        frame.add(checkboxthree);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (checkboxone.isSelected()) {
            amount += 100;
            msg += "Pizza 100\n";
        }
        if (checkboxtwo.isSelected()) {
            amount += 100;
            msg += "Burger 100\n";
        }
        if (checkboxthree.isSelected()) {
            amount += 40;
            msg += "Tea 40\n";
        }
       msg+=msg = "---------------------\n";
        JOptionPane.showMessageDialog(frame,msg+"Total: " + amount);
    }

    public static void main(String[] args) {
        new checkbox();
    }
}
