import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class FinallyBlockWithOutCatch {
    InputStream input = null;
    try {
        input = new FileInputStream("myNewFile.txt");
    } 
    finally {
        if(input != null) {
            try {
                in.close();
            } catch(IOException exp) {
                System.out.println(exp);
            }
        }
    }
}
