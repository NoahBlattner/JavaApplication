package JAnchorFrame;

import JAnchorFrame.AnchorComponent.AnchorComponent;
import JAnchorFrame.AnchorComponent.EAnchor;

Fixed import javax.swing.*;
import java.awt.*;

public class TestAnchorWindow {
    Button button;
    AnchorComponent anchorPanel;

    public TestAnchorWindow(String FrameName, Rectangle rect) {
        JAnchorFrame anchorFrame = new JAnchorFrame(FrameName, rect);

        Panel panel = new Panel();
        button = new Button("MainButton");
        panel.add(button);
        panel.setBounds(255, 255, 50 , 50);
        panel.setVisible(true);
        anchorFrame.addAnchorComponent(panel, EAnchor.PROPORTIONAL);
    }
}
