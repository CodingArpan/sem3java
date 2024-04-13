// Import the necessary packages

import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Q5 extends Applet {

  // Override the init method to set the background and foreground colors
  public void init() {
    // Set the background color to green
    setBackground(Color.green);
    // Set the foreground color to white
    setForeground(Color.white);
  }
  // Override the paint method to display the message
  public void paint(Graphics g) {
    // Draw the message at the center of the applet
    g.drawString("Hello Guni Family", 100, 100);
  }

   
}
