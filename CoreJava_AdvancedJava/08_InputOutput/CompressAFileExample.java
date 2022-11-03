import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

class CompressAFileExample {
    public static void main(String[] args) {
        CompressAFileExample cf = new CompressAFileExample();
        cf.gZipMyFile();
    }

    public void gZipMyFile() {
        byte[] buffer = new byte[1024];
        try {
            GZIPOutputStream gos = 
                new GZIPOutputStream(new FileOutputStream("InputOutputOperationsOnFile.gz"));

            FileInputStream fis = 
                new FileInputStream("InputOutOperationsOnFile.txt");

            int length;
            while((length = fis.read(buffer)) > 0) {
                gos.write(buffer, 0, length);
            }

            fis.close();
            gos.finish();
            gos.close();

            System.out.println("File Compressed!!");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
