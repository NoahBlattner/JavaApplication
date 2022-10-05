package JAnchorFrame;

import JAnchorFrame.AnchorComponent.AnchorComponent;
import JAnchorFrame.AnchorComponent.EAnchor;

import java.awt.*;

public class TestAnchorWindow {
    AnchorComponent mainButton;

    public TestAnchorWindow(String FrameName, Rectangle rect) {
        JAnchorFrame anchorFrame = new JAnchorFrame(FrameName, rect);

        mainButton = new AnchorComponent(new Button("MainButton"), EAnchor.CENTER);
        mainButton.getComponent().setBounds(50, 50, 150, 150);
        anchorFrame.add(mainButton.getComponent(), mainButton.getAnchor());
    }
}
