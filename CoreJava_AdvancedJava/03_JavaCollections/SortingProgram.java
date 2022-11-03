import java.util.*;
public class SortingProgram {
    public static void main(String[] args) {
        ArrayList<SortingArrayListMultiplePropertiesComparator> arraylist = new ArrayList<SortingArrayListMultiplePropertiesComparator>();

        arraylist.add(new SortingArrayListMultiplePropertiesComparator(101, "Aunk", 26));

        arraylist.add(new SortingArrayListMultiplePropertiesComparator(13, "Vinu", 32));

        arraylist.add(new SortingArrayListMultiplePropertiesComparator(504, "Buni", 24));

        // Sorting based on Student Name
        System.out.println("Student Name Sorting");
        Collections.sort(arraylist, SortingArrayListMultiplePropertiesComparator.StuNameComparator);
        
        for(SortingArrayListMultiplePropertiesComparator str: arraylist) {
            System.out.println(str);
        }

        System.out.println("---------------------------------------");

        // Sorting on RollNo
        System.out.println("RollNo Sorting");
        Collections.sort(arraylist, SortingArrayListMultiplePropertiesComparator.StuRollno);
        for(SortingArrayListMultiplePropertiesComparator str: arraylist) {
            System.out.println(str);
        }

        System.out.println("---------------------------------------");
    }
}
