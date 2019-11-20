import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.*;


public class RectangleComponent extends JComponent {

    Random rng = new Random();

    ArrayList<Rectangle> rectangles;

    Color[] colors = new Color[4];

    Stroke stroke = new BasicStroke(5);

    public RectangleComponent( ArrayList<Rectangle> rectangles) {

        this.rectangles=rectangles;
        colors[0]= new Color(255,255,255);
        colors[1]= new Color(200,0,0);
        colors[2]= new Color(40,20,220);
        colors[3]= new Color(220,210,0);

    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for(int i=0; i<rectangles.size();i++){

            g2.setColor(colors[rng.nextInt(4)]);

            g2.fill(rectangles.get(i));

            g2.setColor(Color.black);
            g2.setStroke(stroke);
            g2.draw(rectangles.get(i));

        }


    }

    public void update(ArrayList<Rectangle> rectangles){
        this.rectangles=rectangles;
        repaint();
    }


}