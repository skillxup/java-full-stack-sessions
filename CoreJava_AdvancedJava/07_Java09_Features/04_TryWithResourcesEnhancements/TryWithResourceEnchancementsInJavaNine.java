import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class TryWithResourceEnchancementsInJavaNine {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
        try(fileOutputStream) {
            String mystring = "try with resource enchancements in java9";
            byte bytes[] = mystring.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("given string is written in the file");
        } catch(Exception e) {
            System.out.println(e);
        }
    }    
}
