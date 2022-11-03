import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class DeSerializationOfObject {
    public static void main(String[] args) {
        SerializationStudent sob = null;
        try {
            FileInputStream fis = new FileInputStream("SerializationStudent.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            sob = (SerializationStudent)ois.readObject();
            ois.close();
            fis.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch(ClassNotFoundException cnfe) {
            System.out.println("Student Class is not found.");
            cnfe.printStackTrace();
            return;
        }
        System.out.println("Student Name: " + sob.getStuName());
        System.out.println("Student Age: " + sob.getStuAge());
        System.out.println("Student Roll Num: " + sob.getStuRollNum());
        System.out.println("Student Address: " + sob.getStuAddress());
        System.out.println("Student Height: " + sob.getStuHeight());
    }    
}
