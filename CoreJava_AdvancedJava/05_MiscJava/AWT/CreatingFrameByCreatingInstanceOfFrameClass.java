import java.awt.*;
class CreatingFrameByCreatingInstanceOfFrameClass {
    CreatingFrameByCreatingInstanceOfFrameClass() {
        // creating frame
        Frame fr = new Frame();

        // creating a label
        Label lb = new Label("UserId: ");

        // adding label to the frame
        fr.add(lb);

        // creating text field
        TextField t = new TextField();

        // adding text field to the frame
        fr.add(t);

        // setting frame size
        fr.setSize(500, 300);

        // setting the layout for the frame
        fr.setLayout(new FlowLayout());

        // visible 
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        CreatingFrameByCreatingInstanceOfFrameClass ex = new CreatingFrameByCreatingInstanceOfFrameClass();
    }
}
