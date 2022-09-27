import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class InputStreamToStringConversion {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = null;
        BufferedReader br = null;
        InputStream is = 
            new ByteArrayInputStream("This is a content of my file " . getBytes());
        
        StringBuilder sb = new StringBuilder();
        String content;

        try {
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            while((content = br.readLine()) != null) {
                sb.append(content);
            }
        } catch(IOException ioe) {
            System.out.println("IO Exception Occured");
            ioe.printStackTrace();
        } finally {
            isr.close();
            br.close();
        }

        String mystring = sb.toString();
        System.out.println(mystring);
    }
}
