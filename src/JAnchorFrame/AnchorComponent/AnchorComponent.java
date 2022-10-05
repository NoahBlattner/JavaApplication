package JAnchorFrame.AnchorComponent;

import java.awt.*;

public class AnchorComponent {

    protected Component component;
    protected EAnchor anchor;

    public AnchorComponent(Component component, EAnchor anchor) {
        this.component = component;
        this.anchor = anchor;
    }

    public Component getComponent() {
        return component;
    }

    public EAnchor getAnchor() {
        return anchor;
    }
}

