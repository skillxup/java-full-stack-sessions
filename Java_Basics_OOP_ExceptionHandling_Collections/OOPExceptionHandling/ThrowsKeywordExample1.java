import java.io.*;
class ThrowsKeywordExample {
    void myMethod(int num) throws IOException, ClassNotFoundException {
        if(num == 1) {
            throw new IOException("IOException Occured");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException Occured");
        }
    }
}

public class ThrowsKeywordExample1 {
    public static void main(String[] args) {
        try {
            ThrowsKeywordExample obj = new ThrowsKeywordExample();
            obj.myMethod(1);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
