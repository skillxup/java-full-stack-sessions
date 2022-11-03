import java.util.ArrayList;
import java.util.List;

class WhenDoNotUseSafeVarArgsAnnotation {
    private void print(List... names) {
        for(List<String> name: names) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        WhenDoNotUseSafeVarArgsAnnotation obj = new WhenDoNotUseSafeVarArgsAnnotation();

        List<String> list = new ArrayList<String>();

        list.add("kevin");
        list.add("rick");
        list.add("negan");

        obj.print(list);
    }
}