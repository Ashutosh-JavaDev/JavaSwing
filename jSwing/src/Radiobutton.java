import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radiobutton implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton button;
    JRadioButton Male, Female;
    ButtonGroup group;
    public Radiobutton() {
        frame = new JFrame("Check Gender");
        label = new JLabel("Gender");
        label.setBounds(10, 50, 50, 30);
        Male = new JRadioButton("Male");
        Male.setBounds(40, 100, 100, 30);
        Female=new JRadioButton("Female");
        Female.setBounds(40,150,100,30);
        button = new JButton("Click");
        button.setBounds(40, 200,150,30);
        button.addActionListener(this);
        frame.add(Male);
        frame.add(button);
        frame.add(label);
        frame.add(Female);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(Male.isSelected()){
            JOptionPane.showMessageDialog(frame, "You are Male", null, JOptionPane.INFORMATION_MESSAGE);
            Female.setSelected(false);
        }
        else if(Female.isSelected()){
            JOptionPane.showMessageDialog(frame, "You are Female", null, JOptionPane.INFORMATION_MESSAGE);
            Male.setSelected(false);
        }
    }
    public static void main(String[]args){
        Radiobutton ob=new Radiobutton();
    }
}
