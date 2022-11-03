import java.io.PrintWriter;
import java.io.StringWriter;

class StackTraceToStringConversion {
    public static void main(String[] args) {
        try {
            int i = 5 / 8;
            System.out.println(i);
        } catch(ArithmeticException e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);

            String stacktraceString = sw.toString();
            System.out.println("String is: " + stacktraceString);
        }
    }    
}
