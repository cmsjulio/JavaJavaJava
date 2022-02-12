package chapter1.HelloWorld;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Canvas;

public class HelloWorld extends Canvas {
    public void paint (Graphics g){
        g.drawString("Hello World!", 10,10);
    }

    public static void main (String[] args){
        HelloWorld c = new HelloWorld();
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(150,50);
        f.setVisible(true);
    }
}
