import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class TryWithResourceInJavaSeven {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileOutputStream fileOutputStream = new FileOutputStream("sample.txt")) {
            // we are writing text in the output
            String mystring = "we are writing this line in the output file";

            // converting the given string in bytes
            byte bytes[] = mystring.getBytes();

            // writing the bytes into the file
            fileOutputStream.write(bytes);

            // displaying the message
            System.out.println("The given String is written in the file successfully!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}