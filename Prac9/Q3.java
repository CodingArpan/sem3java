import java.awt.*;
import java.awt.event.*;
public class Q3 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Q3");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });


        Choice c = new Choice();   
   
        c.setBounds(100, 100, 200, 200);    

         
        c.add("IIT Kharagpur");
        c.add("IIT Bombay");
        c.add("IIT Madras");
        c.add("IIT Kanpur");
        c.add("IIT Delhi");
        c.add("IIT Guwahati");
        c.add("IIT Roorkee");
        c.add("IIT Ropar");
        c.add("IIT Bhubaneswar");
        c.add("IIT Gandhinagar");
        c.add("IIT Hyderabad");
        c.add("IIT Jodhpur");
        c.add("IIT Patna");
        c.add("IIT Indore");
        c.add("IIT Mandi");
        c.add("IIT Varanasi");
        c.add("IIT Palakkad");
        c.add("IIT Tirupati");
        c.add("IIT Dhanbad");
        c.add("IIT Bhilai");
        c.add("IIT Dharwad");
        c.add("IIT Jammu");
        c.add("IIT Goa");

        f.add(c);


        Label l = new Label("Selected Institute : ");
        l.setBounds(100, 50, 100, 50);
        f.add(l);

        Label clg = new Label();
        clg.setBounds(250, 50, 90, 50);
        f.add(clg);

        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                clg.setText(c.getSelectedItem());
            }
        });

        
    }
}
