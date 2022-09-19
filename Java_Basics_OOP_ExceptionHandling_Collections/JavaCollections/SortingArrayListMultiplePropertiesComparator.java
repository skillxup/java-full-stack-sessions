import java.util.Comparator;
public class SortingArrayListMultiplePropertiesComparator {
    private String studentname;
    private int rollno;
    private int studentage;

    public SortingArrayListMultiplePropertiesComparator(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    // getter and setter methods
    public String getStudentName() {
        return studentname;
    }

    public void setStudentName(String studentname) {
        this.studentname = studentname;
    }

    public int getRollNo() {
        return rollno;
    }

    public void setRollNo(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentAge() {
        return studentage;
    }

    public void setStudentAge(int studentage) {
        this.studentage = studentage;
    }

    // StuNameComparator
    public static Comparator<SortingArrayListMultiplePropertiesComparator> StuNameComparator = new Comparator<SortingArrayListMultiplePropertiesComparator>() {
        public int compare(SortingArrayListMultiplePropertiesComparator s1, SortingArrayListMultiplePropertiesComparator s2) {
            String StudentName1 = s1.getStudentName().toUpperCase();
            String StudentName2 = s2.getStudentName().toUpperCase();

            return StudentName1.compareTo(StudentName2);
        }
    };


    // StuRollno
    public static Comparator<SortingArrayListMultiplePropertiesComparator> StuRollno = new Comparator<SortingArrayListMultiplePropertiesComparator>() {
        public int compare(SortingArrayListMultiplePropertiesComparator s1, SortingArrayListMultiplePropertiesComparator s2) {
            int rollno1 = s1.getRollNo();
            int rollno2 = s2.getRollNo();

            return rollno1-rollno2;
        }
    };

    @Override
    public String toString() {
        return "[rollno= " + rollno + ", name= " + studentname + ", age=" + studentage + "]";
    }
}