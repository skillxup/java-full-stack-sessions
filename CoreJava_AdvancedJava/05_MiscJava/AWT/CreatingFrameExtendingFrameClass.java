import java.awt.*;

class CreatingFrameExtendingFrameClass extends Frame {
    CreatingFrameExtendingFrameClass() {
        Button b = new Button("Button!!");

        // setting button position on screen
        b.setBounds(50, 50, 50, 50);

        // adding button into frame
        add(b);

        // setting Frame width and height
        setSize(500, 300);

        // setting the title of frame
        setTitle("This is my First AWT Example");

        // setting the layout for the frame
        setLayout(new FlowLayout());

        // by default frame is not visible so we are setting the visibility to true
        setVisible(true);
    }
    public static void main(String[] args) {
        CreatingFrameExtendingFrameClass fr = new CreatingFrameExtendingFrameClass();
    }
}