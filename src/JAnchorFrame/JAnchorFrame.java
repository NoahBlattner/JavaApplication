package JAnchorFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JAnchorFrame extends JFrame implements ComponentListener {

    private int prevFrameWidth;
    private int prevFrameHeight;

    public JAnchorFrame( String frameName, Rectangle rect) {
        super(frameName);
        this.setBounds(rect);
        prevFrameWidth = rect.getBounds().width;
        prevFrameHeight = rect.getBounds().height;
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        for (Component currentComponent : getComponents()) {
            currentComponent.setLocation(   prevFrameWidth / getWidth() * currentComponent.getX(),
                                            prevFrameHeight / getHeight() * currentComponent.getY());
        }
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    };

    @Override
    public void componentShown(ComponentEvent e) {

    };

    @Override
    public void componentHidden(ComponentEvent e) {

    };

}
