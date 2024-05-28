import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combogbox {
    public combogbox() {
        JFrame jframe=new JFrame("Combo Box");
        JLabel jlabel=new JLabel("Select City");
        jlabel.setBounds(15,50,100,20);
        JButton jbutton=new JButton("Click Me");
        jbutton.setBounds(50,100,100,30);
        String city[]={"Bhagalpur", "Ranchi", "Bhopal", "Delhi", "Pune"};
        JComboBox jcombox=new JComboBox(city); 
        jcombox.setBounds(100,50,150,30);
        jframe.add(jcombox);
        jframe.add(jlabel);
        jframe.add(jbutton);
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(jframe, "You are From: "+jcombox.getItemAt(jcombox.getSelectedIndex()), null, 0);
            }
        });
        jframe.setLayout(null);
        jframe.setSize(400,400);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        combogbox ob=new combogbox();
    }
}