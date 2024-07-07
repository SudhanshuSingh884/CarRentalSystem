import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rental {

    //// MAIN//
    public static void main(String[] args) {

        JFrame frame = new RentalView();
        ImageIcon img = new ImageIcon("../images/logo.GIF");
        frame.setIconImage(img.getImage());
        frame.setTitle("NITJ Car Rental");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}