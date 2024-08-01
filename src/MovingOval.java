import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovingOval extends JPanel implements Runnable {
    public int x;
    public int y;
    boolean xInc;
    boolean yInc;
    public MovingOval(){
        x=20;
        y=200;
        xInc=true;
        yInc=false;
        this.setBackground(Color.gray);
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(x+30>this.getWidth()){
            xInc=false;
        }
        if(x<0){
            xInc=true;
        }
        if(y+30>this.getHeight()){
            yInc=false;
        }
        if(y<0){
            yInc=true;
        }
        if(xInc) x+=1;
        else x-=1;
        if(yInc) y+=1;
        else y-=1;

        g.fillOval(x,y,30,30);
        g.setColor(Color.red);

    }

    @Override
    public void run() {
        while (true){
            try{
                this.repaint();
                Thread.sleep(10);
            }catch (InterruptedException ex){
                Logger.getLogger(SimpleDateTime.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }
}
