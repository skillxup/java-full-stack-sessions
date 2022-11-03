import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UsingAnonymousInnerClass extends JFrame {
    JButton button;
    public UsingAnonymousInnerClass() {
        setTitle("Button Action Example without Lambda Expression");
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Button");
        button.setBounds(100, 100, 90, 40);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked the button");
            } 
        });
        add(button);
    }

    public static void main(String[] args) {
        new UsingAnonymousInnerClass();
    }
}
