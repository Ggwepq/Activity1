import java.awt.*;
import java.awt.event.*;

public class Program1 extends Frame implements ActionListener{

    Label lbl1 = new Label("Labelseses1", Label.CENTER);
    Label lbl2 = new Label("Label2", Label.CENTER);
    Label lbl3 = new Label("Label3", Label.CENTER);
    Label lbl4 = new Label("Label4", Label.CENTER);
    Button btn1 = new Button("Modify Frame");

    Font f = new Font("Helvetica", Font.ITALIC, 20);

    Program1() {
        setTitle("Border Layout Demo");
        setSize(500, 500);
        setResizable(false);
        setLayout(new BorderLayout(25, 45));

        // Center the frame when run
        setLocationRelativeTo(null);
        // Close frame with exit button
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
                dispose();
            }
        });

        // new method for the orig version of the frame
        origFrame();

        setVisible(true);
    
    }

    private void origFrame(){

        setBackground(new Color(0xffffff));
        setTitle("Border Layout Demo");

        lbl1.setBackground(Color.orange);
        lbl1.setForeground(Color.yellow);
        lbl1.setFont(f);

        lbl2.setBackground(Color.pink);
        lbl2.setForeground(Color.yellow);
        lbl2.setFont(new Font("Helvetica", Font.BOLD, 28));

        lbl3.setBackground(Color.red);
        lbl3.setForeground(Color.yellow);
        lbl3.setFont(new Font("Helvetica", Font.BOLD, 28));

        lbl4.setBackground(Color.CYAN);
        lbl4.setForeground(Color.yellow);
        lbl4.setFont(new Font("Helvetica", Font.BOLD, 28));

        btn1.setBackground(Color.gray);
        btn1.setForeground(Color.yellow);
        btn1.setFont(new Font("Helvetica", Font.BOLD, 28));
        btn1.addActionListener(this);

        add(btn1, "Center");
        add("North", lbl1);
        add(lbl2, "South");
        add(lbl3, "West");
        add(lbl4, "East");
    }

    // New method to modify the original frame
    private void modifiedGUI(){

        setBackground(new Color(0x1e1e1e));
        setTitle("Border Layout Demo (Colorschemes)");

        lbl1.setText("Red Dragon");
        lbl1.setBackground(new Color(0x1a0b0c));
        lbl1.setForeground(new Color(0xff3a32));
        lbl1.setFont(new Font("Comfortaa", Font.PLAIN, 20));

        lbl2.setText("Trance");
        lbl2.setBackground(new Color(0x00021b));
        lbl2.setForeground(new Color(0xe51376));
        lbl2.setFont(new Font("Comfortaa", Font.PLAIN, 20));

        lbl3.setText("Chaos");
        lbl3.setBackground(new Color(0x141221));
        lbl3.setForeground(new Color(0xfd77d7));
        lbl3.setFont(new Font("Comfortaa", Font.PLAIN, 20));

        lbl4.setText("Ryujin");
        lbl4.setBackground(new Color(0x081426));
        lbl4.setForeground(new Color(0xf17754));
        lbl4.setFont(new Font("Comfortaa", Font.PLAIN, 20));

        btn1.setLabel("Original Frame");
        btn1.setBackground(new Color(0x242425));
        btn1.setForeground(new Color(0x2b5f6d));
        btn1.setFont(new Font("Arial Black", Font.BOLD, 25));
        btn1.setFocusable(false);
        btn1.addActionListener(e -> origFrame());

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            modifiedGUI();
        }

    }

    public static void main(String args[]) {
        new Program1();
    }
}