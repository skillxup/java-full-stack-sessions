import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ResourceDeclaredOutsideDuplicateResourceWorkAround {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
        try(FileOutputStream fileOutputStream2 = fileOutputStream) {
            String mystring = "its a duplicate resource";
            byte bytes[] = mystring.getBytes();
            fileOutputStream2.write(bytes);
            System.out.println("given string is written in the file");
        } catch(Exception e) {
            System.out.println(e);
        }
    }    
}
