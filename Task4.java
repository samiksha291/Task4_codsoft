import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Task4 extends JFrame implements ActionListener {
    JLabel title, base, target, amount, amt;
    JTextField atext;
    JButton b;
    JComboBox<String> base_choice;
    JComboBox<String> target_choice;

    public Task4() {
        Method();
    }

    public void Method() {
        setTitle("Currency Converter");
        setSize(400, 400);
        setLayout(null);

        title = new JLabel("Currency Converter");
        title.setBounds(120, 10, 200, 30);

        base = new JLabel("Base Currency");
        base.setBounds(30, 60, 100, 30);
        String[] c = { "USD", "INR", "EUR", "GBP", "JPY"};
        base_choice = new JComboBox<>(c);
        base_choice.setBounds(150, 60, 100, 30);

        target = new JLabel("Target Currency");
        target.setBounds(30, 100, 120, 30);
        String[] a = { "USD", "INR", "EUR", "GBP", "JPY" };
        target_choice = new JComboBox<>(a);
        target_choice.setBounds(150, 100, 100, 30);

        amount = new JLabel("Amount");
        amount.setBounds(30, 140, 100, 30);
        atext = new JTextField();
        atext.setBounds(150, 140, 100, 30);

        b = new JButton("Convert");
        b.setBounds(100, 190, 120, 30);

        amt = new JLabel("Converted Amount:");
        amt.setBounds(30, 240, 300, 30);
        b.addActionListener(this);

        add(title);
        add(base);
        add(target);
        add(amount);
        add(amt);
        add(atext);
        add(b);
        add(base_choice);
        add(target_choice);
        setVisible(true);

    }

   public void actionPerformed(ActionEvent e) {
    try {
        float amount = Float.parseFloat(atext.getText());
        String from = (String) base_choice.getSelectedItem();
        String to = (String) target_choice.getSelectedItem();

        float rate = 1.0f;

        if (from.equals(to)) {
            rate = 1f;
        } else if (from.equals("USD") && to.equals("INR")) {
            rate = 83.0f;
        } else if (from.equals("INR") && to.equals("USD")) {
            rate = 1 / 83.0f;
        } else if (from.equals("USD") && to.equals("EUR")) {
            rate = 0.92f;
        } else if (from.equals("EUR") && to.equals("USD")) {
            rate = 1 / 0.92f;
        } else if (from.equals("USD") && to.equals("GBP")) {
            rate = 0.79f;
        } else if (from.equals("GBP") && to.equals("USD")) {
            rate = 1 / 0.79f;
        } else if (from.equals("USD") && to.equals("JPY")) {
            rate = 157.0f;
        } else if (from.equals("JPY") && to.equals("USD")) {
            rate = 1 / 157.0f;
        } else if (from.equals("INR") && to.equals("EUR")) {
            rate = 0.011f;
        } else if (from.equals("EUR") && to.equals("INR")) {
            rate = 90.0f;
        } else if (from.equals("INR") && to.equals("GBP")) {
            rate = 0.0095f;
        } else if (from.equals("GBP") && to.equals("INR")) {
            rate = 105.0f;
        } else if (from.equals("INR") && to.equals("JPY")) {
            rate = 1.89f;
        } else if (from.equals("JPY") && to.equals("INR")) {
            rate = 1 / 1.89f;
        } else if (from.equals("EUR") && to.equals("GBP")) {
            rate = 0.86f;
        } else if (from.equals("GBP") && to.equals("EUR")) {
            rate = 1 / 0.86f;
        } else if (from.equals("EUR") && to.equals("JPY")) {
            rate = 171.0f;
        } else if (from.equals("JPY") && to.equals("EUR")) {
            rate = 1 / 171.0f;
        } else if (from.equals("GBP") && to.equals("JPY")) {
            rate = 199.0f;
        } else if (from.equals("JPY") && to.equals("GBP")) {
            rate = 1 / 199.0f;
        } else {
            rate = 1.0f; // fallback
        }

        float result = amount * rate;
        amt.setText("Converted Amount: " + result + " " + to);
    } catch (Exception ex) {
        amt.setText("Something went wrong. Please try again");
    }
}


    public static void main(String[] args) {
        Task4 obj=new Task4();
    }

}