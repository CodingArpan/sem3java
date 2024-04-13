import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1 extends Frame {
	public Q1() {
		setVisible(true);
		setBounds(100, 500, 400, 400);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		setBounds(200, 200, 600, 600);
		setBackground(Color.green);
		// draw the face
		
		g.setColor(Color.YELLOW);// ww w . ja v a 2s .com
		g.fillOval(110, 110, 200, 200);

		// draw the eyes
		g.setColor(Color.BLACK);
		g.fillOval(155, 165, 30, 30);
		g.fillOval(235, 165, 30, 30);

		// draw the mouth
		g.fillOval(150, 210, 120, 60);

		// "touch up" the mouth into a smile
		g.setColor(Color.YELLOW);
		g.fillRect(150, 210, 120, 30);
		g.fillOval(150, 220, 120, 40);
	}

	public static void main(String[] args) {
		new Q1();
	}
}
