import javax.swing.*;

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
        jlabel.setBounds(10,25,100,30);
        jbutton.setBounds(10,50,100,30);
        jpasswordfield.setBounds(25,50,100,30);
        textfield.setBounds(35,45,100,30);
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
}