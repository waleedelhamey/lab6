import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SlidingText extends JPanel implements Runnable {
    public int x;
    public int y;
    public SlidingText(){
        x=100;
        y=100;
        this.setBackground(Color.gray);
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        x+=20;
        if(x>=this.getWidth()){
            x=0;
        }
        g.drawString("Waleed",x,y);
    }

    @Override
    public void run() {
        while (true){
            try{
                this.repaint();
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                Logger.getLogger(SimpleDateTime.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
}
