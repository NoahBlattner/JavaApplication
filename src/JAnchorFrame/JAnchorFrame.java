package JAnchorFrame;

import JAnchorFrame.AnchorComponent.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class JAnchorFrame extends JFrame implements ComponentListener {

    private int prevFrameWidth;
    private int prevFrameHeight;

    private ArrayList<AnchorComponent> anchorComponents;

    public JAnchorFrame( String frameName, Rectangle rect) {
        super(frameName);
        this.setBounds(rect);
        prevFrameWidth = rect.getBounds().width;
        prevFrameHeight = rect.getBounds().height;
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public AnchorComponent addAnchorComponent(Component component, EAnchor anchor)  {
        add(component);

        AnchorComponent anchorComponent = new AnchorComponent(component, anchor);
        anchorComponents.add(anchorComponent);

        return anchorComponent;
    }

    public AnchorComponent addAnchorComponent(AnchorComponent anchorComponent)  {
        add(anchorComponent.getComponent());

        anchorComponents.add(anchorComponent);

        return anchorComponent;
    }

    @Override
    public void componentResized(ComponentEvent e) {
        for (AnchorComponent currentComponent : anchorComponents) {
            Component component = currentComponent.getComponent();
            switch (currentComponent.getAnchor()) {
                case CENTER:
                case PROPORTIONAL:
                component.setLocation(prevFrameWidth / getWidth() * component.getX(),
                        prevFrameHeight / getHeight() * component.getY());
            }
        }
        prevFrameHeight = getHeight();
        prevFrameWidth = getWidth();
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }

}
