import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Radiobutton {
    JFrame frame;
    JLabel label;
    JButton button;
    JRadioButton Male,Female;
    public Radiobutton(){
        frame=new JFrame("Check Gender");
        label=new JLabel("Gender");
        label.setBounds(50,100,100,30);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}
