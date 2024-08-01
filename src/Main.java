import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Hello Waleed");
        SimpleDateTime movingOval = new SimpleDateTime();
        frame.setContentPane(movingOval);
        frame.setSize(500,500);
        frame.setVisible(true);


    }
}