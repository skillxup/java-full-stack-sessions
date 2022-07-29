import java.io.*;

class CheckedExceptions {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        fis = new FileInputStream("myfle.txt");
        int k;

        while((k = fis.read()) != -1) {
            System.out.print((char)k);
        }

        fis.close();
    }    
}
