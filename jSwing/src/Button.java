import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button {
    JFrame frame;

    public Button(){
        frame=new JFrame("This is the main Title");
        JButton button=new JButton("Click Me");
        button.setBounds(40,40,100,30);
        frame.add(button);
        JTextArea text=new JTextArea();
        text.setBounds(40,90,100,40);
        frame.add(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                text.setText("This is the Action");
            }
        });
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        Button ob=new Button();
    }
}
