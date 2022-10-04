package JAnchorFrame.AnchorComponents;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class AnchorComponent extends Component {

    public enum Anchor {
        TOP("Top"),
        BOTTOM("Bottom"),
        LEFT("Left"),
        RIGHT("Right"),
        TOP_LEFT("Top left"),
        BOTTOM_LEFT("Bottom left"),
        TOP_RIGHT("Top right"),
        BOTTOM_RIGHT("Bottom right"),
        CENTER("Center");

        private String desciption;
        Anchor(String desciption) {
            this.desciption = desciption;
        }
        @Override
        public String toString() {
            return desciption;
        }
    }

    protected Component component;
    protected Anchor anchor;

    public AnchorComponent(Component component, Anchor anchor) {
        super();
        this.component = component;
        this.anchor = anchor;
    }


}

