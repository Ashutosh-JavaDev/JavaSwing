import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {
    JFrame frame;

    public Button(){
        frame=new JFrame("This is the main Title");
        JButton button=new JButton("Click Me");
        button.setBounds(40,40,100,30);
        button.add(button);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        Button ob=new Button();
    }
}
