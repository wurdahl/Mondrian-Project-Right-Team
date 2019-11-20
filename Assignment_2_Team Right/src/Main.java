import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    //THIS TEAM IS GARBAGE --> SEE @RDOUGHTY10 on github for a better version
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_WIDTH = 1100;

    private static final int BASE_X = 10;
    private static final int BASE_Y = 10;
    private static final int BASE_WIDTH = 1000;
    private static final int BASE_HEIGHT = 500;


    public static void main(String[] Args){

        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Rectangle base = new Rectangle(BASE_X,BASE_Y,BASE_WIDTH,BASE_HEIGHT);

        MondrianRectangle painting = new MondrianRectangle(base);
        painting.makeRectangle(painting.baseRectangle);
        RectangleComponent comp= new RectangleComponent(painting.getPainting());

        frame.add(comp);
        frame.setVisible(true);


        class SpacebarListener implements KeyListener {

            public void keyPressed(KeyEvent e) {

                int keybind = e.getKeyCode();

                if (keybind == KeyEvent.VK_SPACE) {

                    MondrianRectangle painting1 = new MondrianRectangle(base);
                    painting1.makeRectangle(painting1.baseRectangle);
                    comp.update(painting1.getPainting());

                }

            }

            public void keyReleased(KeyEvent e){ }

            public void keyTyped(KeyEvent e){ }

        }

        SpacebarListener spacebarListener = new SpacebarListener();
        frame.addKeyListener(spacebarListener);


    }

}
