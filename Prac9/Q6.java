import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Q6 extends Applet implements KeyListener {
    Image carImage;
    int x = 0, y = 0, move = 5;

    public void init() {
        setBounds(0, 0, 1400, 800);
        setSize(1400, 800);
        carImage = getImage(getDocumentBase(), "https://th.bing.com/th/id/R.d8dd00d2d4c78eed9fb3e6c3862156ab?rik=cHcgxBA%2ffPOtkA&riu=http%3a%2f%2fwww.pngmart.com%2ffiles%2f5%2fRace-Car-PNG-HD.png&ehk=OESMiel2i6Cy6S3iMALu9Wn1bmGyhLwm6VMGI7MGbso%3d&risl=&pid=ImgRaw&r=0");
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawImage(carImage, x, y, this);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= move;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += move;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}
