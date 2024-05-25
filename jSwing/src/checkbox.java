import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox {
    JFrame frame;
    JButton button;
    JLabel label;
    JCheckBox checkboxone,checkboxtwo,checkboxthree;
    public checkbox() {
        frame=new JFrame("This is Jframe box");
        label=new JLabel("Food Items");
        checkboxone=new JCheckBox("Pizza 100");
        checkboxone.setBounds(50,100,150,30);
        checkboxtwo=new JCheckBox("Burger 100");
        checkboxtwo.setBounds(50,150,150,30);
        checkboxthree=new JCheckBox("Tea 40");
        checkboxthree.setBounds(50,200,150,30);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
