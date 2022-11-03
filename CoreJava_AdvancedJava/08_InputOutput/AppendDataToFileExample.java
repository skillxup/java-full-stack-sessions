import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class AppendDataToFileExample {
    public static void main(String[] args) {
        try {
            String content = " This is my content with would be appended " + 
            " at the end of the specified File";
            File file = new File("newfile.txt");
            
            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Data successfully appended at the end of File");
        } catch(IOException ioe) {
            System.out.println("Exception occured: ");
            ioe.printStackTrace();
        }
    }
}
