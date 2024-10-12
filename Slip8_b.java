//Design a screen to handle the Mouse Events such as MOUSE_MOVED
//and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField.

import java.awt.*;
import java.awt.event.*;

public class Slip8_b extends Frame implements MouseListener, MouseMotionListener {
    TextField textField;

    Slip8_b() {
        textField = new TextField(30);
        add(textField, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 400);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        textField.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        textField.setText("Mouse Moved to: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new Slip8_b();
    }
}
