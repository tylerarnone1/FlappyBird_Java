package flappybird;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FlappyBird 
{

    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public FlappyBird() {
        
        JFrame jframe = new JFrame();

        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

    }
    public void repaint(Graphics g){


    }
    public static void main(String[] args)
    {

        flappyBird = new FlappyBird();
    }

}