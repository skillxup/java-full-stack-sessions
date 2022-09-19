import java.util.*;
public class CreatingArrayListOfStudentObject {
    public static void main(String[] args) {
        ArrayList<CreatingGroupOfPropertiesMethodsOfStudent> arraylist = new ArrayList<CreatingGroupOfPropertiesMethodsOfStudent>();

        arraylist.add(new CreatingGroupOfPropertiesMethodsOfStudent(235, "Rahul", 24));
        arraylist.add(new CreatingGroupOfPropertiesMethodsOfStudent(245, "Ajeet", 32));
        arraylist.add(new CreatingGroupOfPropertiesMethodsOfStudent(643, "Chaitanya", 45));

        Collections.sort(arraylist);

        for(CreatingGroupOfPropertiesMethodsOfStudent str: arraylist) {
            System.out.println(str);
        }
    }
}
