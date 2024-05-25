import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox {
    JFrame frame;
    JButton button;
    JCheckBox checkboxone,checkboxtwo,checkboxthree;
    public checkbox() {
        frame=new JFrame("This is Jframe box");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
