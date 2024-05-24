import javax.swing.*;

public class Password {
    JFrame jframe;
    JLabel jlabel;
    JPasswordField jpasswordfield;
    JButton jbutton;
    public Password() {
        jframe=new JFrame("This Is Password Block");

        jlabel=new JLabel("Password");
        jbutton=new JButton("Check Password");
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
    }
}