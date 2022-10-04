package JAnchorFrame;

import javax.swing.*;
import java.awt.*;

public class connectionWindow {
    // create the window with the class Windows.defaultWindows
    public static JFrame createWindow(String name, int width, int height) {
        JFrame frame = defaultWindows.createWindow(name, width, height);
        // add the button to the window
        defaultWindows.addButton(frame, "Connection", 200, 200, 100, 50);
        // add the label to the window
        defaultWindows.addLabel(frame, "Connection", 200, 100, 100, 50);
        // change the color of the window
        defaultWindows.changeColor(frame, Color.darkGray);
        // responsive window
        frame.setLayout(null);



        return frame;
    }

}
