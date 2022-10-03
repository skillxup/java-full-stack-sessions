import java.io.StringWriter;

class WriterToStringConversion {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();

        sw.append("abc");
        sw.append(" xyz");

        String str = sw.toString();
        System.out.println(str);
    }
}
