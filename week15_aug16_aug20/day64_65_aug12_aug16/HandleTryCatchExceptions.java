import java.io.*;

class HandleTryCatchExceptions {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("myile.txt");
        } catch(FileNotFoundException fnfe) {
            System.out.print("The specified file is not present at the given path");
        }
        int k;
        try {
            while((k = fis.read()) != -1) {
                System.out.print((char)k);
            }
            fis.close();
        } catch(IOException ioe) {
            System.out.print("I/O error occured: " + ioe);
        }
    }
}
