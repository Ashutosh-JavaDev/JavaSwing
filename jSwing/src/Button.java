import javax.swing.*;

public class Button {
    JFrame frame;

    public Button(){
        frame=new JFrame("This is the main Title");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        Button ob=new Button();
    }
}
