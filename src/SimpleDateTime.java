import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleDateTime extends JPanel implements Runnable {

    public SimpleDateTime(){
        this.setBackground(Color.PINK);
        new Thread(this).start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toString(),100,200);

    }
    @Override
    public void run() {
        while (true){
            try{
                this.repaint();
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                Logger.getLogger(SimpleDateTime.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
}
