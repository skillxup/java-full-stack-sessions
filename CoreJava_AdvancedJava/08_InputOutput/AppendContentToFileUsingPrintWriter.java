import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class AppendContentToFileUsingPrintWriter {
    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt");

            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("");
            pw.println("This is first line");
            pw.println("This is the second line");
            pw.println("This is third line");
            pw.close();

            System.out.println("Data successfully appended at the end of File");
        } catch(IOException ioe) {
            System.out.println("Exception occured: ");
            ioe.printStackTrace();
        }
    }
}
