package JAnchorFrame;

import javax.swing.*;
import java.awt.*;

public class defaultWindows {

    /**
     * Create a window to connect
     * @param name nom de la fenêtre
     * @param width largeur de la fenêtre
     * @param height hauteur de la fenêtre
     * @return la fenêtre
     */
    public static JFrame createWindow(String name, int width, int height) {
        JFrame frame = new JFrame(name);
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    /**
     * Change the color of the window
     * @param frame la fenêtre
     * @param color la couleur
     */
    public static void changeColor(JFrame frame, Color color) {
        frame.getContentPane().setBackground(color);
    }

    /**
     * Add a button to the window
     * @param frame la fenêtre
     * @param name le nom du bouton
     * @param x position x du bouton
     * @param y position y du bouton
     * @param width largeur du bouton
     * @param height hauteur du bouton
     * @return le bouton
     */
    public static JButton addButton(JFrame frame, String name, int x, int y, int width, int height) {
        JButton button = new JButton(name);
        button.setBounds(x, y, width, height);
        frame.add(button);
        // anchor the button to the bottom right corner
        button.setHorizontalAlignment(SwingConstants.CENTER);
        // on resize, the button is resized and repositioned
        frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                // get the size of the window
                int width = frame.getWidth();
                int height = frame.getHeight();
                // resize the button
                button.setBounds(width/2 - 50, height/2 - 25, 100, 50);
            }
        });
        return button;
    }

    /**
     * Add a label to the window
     * @param frame la fenêtre
     * @param name le nom du label
     * @param x position x du label
     * @param y position y du label
     * @param width largeur du label
     * @param height hauteur du label
     * @return le label
     */
    public static JLabel addLabel(JFrame frame, String name, int x, int y, int width, int height) {
        JLabel label = new JLabel(name);
        label.setBounds(x, y, width, height);
        frame.add(label);
        // the label is anchored to the top left corner
        label.setHorizontalAlignment(SwingConstants.CENTER);
        // style of the label
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.white);
        // on resize, the label is resized and repositioned
        frame.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                // get the size of the window
                int width = frame.getWidth();
                int height = frame.getHeight();
                // resize the label
                label.setBounds(width / 2 - 50, height / 2 - 125, 100, 50);
            }
        });

        return label;
    }

    // responsive window
    public static void responsiveWindow(JFrame frame) {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
    }


}
