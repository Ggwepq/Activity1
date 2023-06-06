import java.awt.*;
import java.awt.event.*;

public class Program3 extends Frame implements ItemListener {

    Checkbox cocktail = new Checkbox("Cocktail");
    Checkbox dinner = new Checkbox("Dinner");
    CheckboxGroup meal = new CheckboxGroup();
    Checkbox beef = new Checkbox("Beef", false, meal);
    Checkbox chicken = new Checkbox("Chicken", false, meal);
    Checkbox pork = new Checkbox("Pork", false, meal);
    int ctPrice = 400, dinePrice = 300, bfPrice = 300, chkPrice = 200, prkPrice = 150;
    int totalCharge = 0;

    Label price = new Label("Price : " + totalCharge, Label.CENTER);

    public Program3(String title) {

        super(title);
        setSize(400, 500);
        setResizable(false);
        setLayout(null);
        setBackground(new Color(0x0b0e13));
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        price.setBounds(50, 50, 300, 100);
        price.setFont(new Font("Helvetica", Font.BOLD, 40));
        price.setForeground(Color.WHITE);

        beef.setBounds(25, 160, 350, 80);
        beef.setBackground(new Color(0x1b1e2a));
        beef.setForeground(new Color(0x7ebab5));
        beef.setFont(new Font("Arial", Font.BOLD, 30));
        beef.setFocusable(false);

        chicken.setBounds(25, 250, 350, 80);
        chicken.setBackground(new Color(0x14161f));
        chicken.setForeground(new Color(0x7ebab5));
        chicken.setFont(new Font("Arial", Font.BOLD, 30));
        chicken.setFocusable(false);

        pork.setBounds(25, 340, 350, 80);
        pork.setBackground(new Color(0x10121a));
        pork.setForeground(new Color(0x7ebab5));
        pork.setFont(new Font("Arial", Font.BOLD, 30));
        pork.setFocusable(false);

        cocktail.setBounds(100, 430, 100, 50);
        cocktail.setForeground(Color.WHITE);
        cocktail.setFont(new Font("Arial", Font.BOLD, 20));
        cocktail.setFocusable(false);

        dinner.setBounds(220, 430, 100, 50);
        dinner.setForeground(Color.WHITE);
        dinner.setFont(new Font("Arial", Font.BOLD, 20));
        dinner.setFocusable(false);

        cocktail.addItemListener(this);
        dinner.addItemListener(this);
        beef.addItemListener(this);
        chicken.addItemListener(this);
        pork.addItemListener(this);
        
        add(price);
        add(beef);
        add(chicken);
        add(pork);
        add(cocktail);
        add(dinner);

    }

    public void itemStateChanged(ItemEvent e) {
        int sum = totalCharge;

        if (cocktail.getState()) {
            sum += ctPrice;// sum=sum+ct;
        }

        if (dinner.getState()) {
            sum += dinePrice;
        }

        Checkbox wel = meal.getSelectedCheckbox();
        if (wel == beef) {
            price.setBackground(beef.getBackground());
            sum += bfPrice;
        } else if (wel == chicken) {
            price.setBackground(chicken.getBackground());
            sum += chkPrice;
        } else if (wel == pork) {
            price.setBackground(pork.getBackground());
            sum += prkPrice;
        }

        price.setText("Price : " + Integer.toString(sum));

    }

    public static void main(String[] args) {
       new Program3("Restaurant").setVisible(true);;

    }

}