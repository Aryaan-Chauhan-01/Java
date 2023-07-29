import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.lang.Thread;
import java.util.*;
public class Board extends JPanel implements Runnable{
public static final int DIM_WIDTH = 640;
public static final int DIM_HEIGHT = 640;
Thread t,t1,t3;
public Board()
{


t=new Thread(this,"RED");
t.start();
t1=new Thread(this,"BLUE");
t1.start();
}
public void run()
{
System.out.println("Thread started");
for(int i=0;i<100;i++)
{
repaint();
try{Thread.sleep(100);}catch(Exception e){}
}
}
@Override
public void paint(Graphics g) {

g.drawRect(0,0,DIM_WIDTH,DIM_HEIGHT);
g.setColor(java.awt.Color.WHITE);
g.fillRect(0,0,DIM_WIDTH,DIM_HEIGHT);
if(Thread.currentThread().getName().equals("RED"))
{
g.setColor(java.awt.Color.RED);
}
else
{
g.setColor(java.awt.Color.BLUE);
}
g.fillOval((int)(Math.random()*640),(int)(Math.random()*640),30,30);


}



 public static void main(String[] args) {
JFrame frame = new JFrame();
frame.add(new Board());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
