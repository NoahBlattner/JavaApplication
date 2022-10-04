package JAnchorFrame;

import JAnchorFrame.AnchorComponents.AnchorComponent;

import java.awt.*;

public class TestAnchorWindow {
    Button mainButton;

    public TestAnchorWindow(String FrameName, Rectangle rect) {
        JAnchorFrame anchorFrame = new JAnchorFrame(FrameName, rect);

        mainButton = new Button("MainButton");
        mainButton.setBounds(50, 50, 150, 150);
        anchorFrame.add(new AnchorComponent(mainButton, AnchorComponent.Anchor.CENTER));
    }
}
