import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ResourceDeclaredOutsideTryWithResourceBlock {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");

        try(fileOutputStream) {
            String mystring = "we are writing the text!";
            byte bytes[] = mystring.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("the given string is written in the file!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }    
}
