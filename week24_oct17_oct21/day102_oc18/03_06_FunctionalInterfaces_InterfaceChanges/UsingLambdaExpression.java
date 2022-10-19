import javax.swing.*;
import java.awt.*;

class UsingLambdaExpression extends JFrame {
    JButton button;

    public UsingLambdaExpression() {
        setTitle("Button Action Example with Lambda Expression");
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Button");
        button.setBounds(100, 100, 90, 40);

        // lambda expression
        button.addActionListener(e -> System.out.println("You clicked the button"));
        add(button);
    }

    public static void main(String[] args) {
        new UsingLambdaExpression();
    }
}
