import java.util.Collections;
import java.util.Vector;

public class CopyElementsOfOneVectorToAnother {
    public static void main(String[] args) {
        Vector<String> va = new Vector<String>();

        va.add("AB");
        va.add("BC");
        va.add("CD");
        va.add("DE");

        Vector<String> vb = new Vector<String>();

        vb.add("1st");
        vb.add("2nd");
        vb.add("3rd");
        vb.add("4th");
        vb.add("5th");
        vb.add("6th");
        vb.add("7th");

        System.out.println("Vector vb before Copy: " + vb);

        Collections.copy(vb, va);

        System.out.println("Vector vb after Copy: " + vb);

    }    
}
