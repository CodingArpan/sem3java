import java.awt.*;
import java.awt.event.*;

public class Q2 {

    void changeColor() {
        Frame f = new Frame();
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(null);

        Button GreenBtn = new Button("Green");
        GreenBtn.setBounds(100, 100, 100, 50);
        GreenBtn.setBackground(Color.GREEN);
        GreenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.GREEN);
            }
        });
        f.add(GreenBtn);

        Button BlueBtn = new Button("Blue");
        BlueBtn.setBounds(200, 100, 100, 50);
        BlueBtn.setBackground(Color.BLUE);
        BlueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.BLUE);
            }
        });
        f.add(BlueBtn);

        Button YellowBtn = new Button("Yellow");
        YellowBtn.setBounds(300, 100, 100, 50);
        YellowBtn.setBackground(Color.YELLOW);
        YellowBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.YELLOW);
            }
        });
        f.add(YellowBtn);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });




    }

    public static void main(String[] args) {
        new Q2().changeColor();
    }

}
