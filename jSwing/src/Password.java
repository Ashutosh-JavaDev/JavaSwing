import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password {
    JFrame jframe;
    JLabel jlabel;
    JPasswordField jpasswordfield;
    JButton jbutton;
    JTextField textfield;

    public Password() {
        jframe = new JFrame("This Is Password Block");
        jlabel = new JLabel("Password");
        jbutton = new JButton("Check Password");
        jpasswordfield=new JPasswordField();
        textfield = new JTextField();
        jlabel.setBounds(40, 10, 100, 30);
        jbutton.setBackground(Color.red);
        jbutton.setForeground(Color.BLACK);
        jbutton.setBounds(50, 100, 100, 30);
        jpasswordfield.setBounds(150, 10, 100, 30);
        textfield.setBounds(105, 45, 100, 30);
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textfield.setText(jpasswordfield.getText());
            }
        });
        jframe.add(jbutton);
        jframe.add(jlabel);
        jframe.add(jpasswordfield);
        jframe.add(textfield);
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        Password ob=new Password();
    }
}