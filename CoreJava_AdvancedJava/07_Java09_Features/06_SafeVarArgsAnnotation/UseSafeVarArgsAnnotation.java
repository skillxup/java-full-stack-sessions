import java.util.ArrayList;
import java.util.List;

class UseSafeVarArgsAnnotation {
    @SafeVarargs
    private void print(List... names) {
        for(List<String> name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        UseSafeVarArgsAnnotation obj = new UseSafeVarArgsAnnotation();
        List<String> list = new ArrayList<String>();

        list.add("kevin");
        list.add("rick");
        list.add("negan");

        obj.print(list);
    }
}
