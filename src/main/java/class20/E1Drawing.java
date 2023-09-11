package class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {

        JFrame frame=new JFrame();//creating an obj from the class
        MyCanvas c=new MyCanvas();//created my own class
        frame.setSize(2000,2000);//calling the method
        frame.add(c);//calling the method
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close it fully//calling the method
        frame.setVisible(true);//calling the method

    }
}
class MyCanvas extends Canvas{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        g.fillOval(200,200,500,500);//size and where i want to draw it

        g.setColor(Color.CYAN);
        g.fillRect(800,200,500,500);
    }
}
