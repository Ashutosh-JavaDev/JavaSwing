import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combogbox {
    public combogbox() {
        JFrame jframe=new JFrame("Combo Box");
        JLabel jlabel=new JLabel();
        JButton jbutton=new JButton("Click Me");
        String city[]={"Bhagalpur, Ranchi, Bhopal, Delhi, Pune"};
        JComboBox jcombox=new JComboBox(city); 
        jframe.setLayout(null);
        jframe.setSize(400,400);
    }
}