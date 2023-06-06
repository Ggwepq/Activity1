import java.awt.*;
import java.awt.event.*;

public class Program2 extends Frame{

    Program2(){

        setTitle("FlowLayout Demo (FD)");
        setSize(700,500);
        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        setBackground(new Color(0x18181a));

        // Center the frame when run
        setLocationRelativeTo(null);
        // Close frame with exit button
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
                dispose();
            }
        });

        components();
    }

    private void components(){

        Label lbl1 = new Label("Field 1", Label.CENTER);
        Label lbl2 = new Label("Field 2", Label.CENTER);
       
        TextField tf1 =new TextField(45);
        TextField tf2 =new TextField(45);

        tf1.setBackground(new Color(0x1e1e1e));
        tf1.setForeground(new Color(0x47bac0));
        tf1.setFont(new Font("Comfortaa", Font.PLAIN, 15));

        tf2.setBackground(new Color(0x1e1e1e));
        tf2.setForeground(new Color(0x47bac0));
        tf2.setFont(new Font("Comfortaa", Font.PLAIN, 15));

        lbl1.setBackground(new Color(0x141221));
        lbl1.setForeground(new Color(0xe4609b));    
        lbl1.setFont(new Font("Helvetica", Font.BOLD,18));
        lbl1.setPreferredSize(new Dimension(100, 40));
   
        lbl2.setBackground(new Color(0x141221));
        lbl2.setForeground(new Color(0xe4609b));    
        lbl2.setFont(new Font("Helvetica", Font.BOLD,18));
        lbl2.setPreferredSize(new Dimension(100, 40));

        add(lbl1);
        add(tf1);
        add(lbl2);
        add(tf2);
    }
   
    public static void main(String args[]){
        
        new Program2().setVisible(true);
       
    }
}