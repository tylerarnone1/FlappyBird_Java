package flappybird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel{

    private static final long serialversionUID = 1l;

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}