import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Password {
    JFrame jframe;
    JLabel jlabel;
    JPasswordField jpasswordfield;
    JButton jbutton;
    JTextField textfield;
    public Password() {
        jframe=new JFrame("This Is Password Block");
        jlabel=new JLabel("Password");
        jbutton=new JButton("Check Password");
        textfield=new JTextField();
        jlabel.setBounds(10,25,100,30);
        jbutton.setBounds(10,50,100,30);
        jpasswordfield.setBounds(25,50,100,30);
        textfield.setBounds(35,45,100,30);
       jbutton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){

            textfield.getText();
        }
       });
        jframe.add(jbutton);
        jframe.add(jlabel);
        jframe.add(jpasswordfield);
        jframe.add(textfield);
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
}