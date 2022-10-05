package JAnchorFrame.AnchorComponent;

public enum EAnchor {
        TOP("Top"),
        BOTTOM("Bottom"),
        LEFT("Left"),
        RIGHT("Right"),
        TOP_LEFT("Top left"),
        BOTTOM_LEFT("Bottom left"),
        TOP_RIGHT("Top right"),
        BOTTOM_RIGHT("Bottom right"),
        CENTER("Center"),
        PROPORTIONAL("Proportional");

        private final String desciption;
        EAnchor(String desciption) {
            this.desciption = desciption;
        }

        @Override
        public String toString() {
            return desciption;
        }
}