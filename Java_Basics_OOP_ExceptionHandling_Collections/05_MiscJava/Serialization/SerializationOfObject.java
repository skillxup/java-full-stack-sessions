import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class SerializationOfObject {
    public static void main(String[] args) {
        SerializationStudent obj = new SerializationStudent(1, 23, "John", "UAE", 6);

        try {
            FileOutputStream fos = new FileOutputStream("SerializationStudent.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Serialization Done!!");
        } catch(IOException ioe) {
            System.out.println(ioe);
        }
    }    
}
