public class ImplementingComparable implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public ImplementingComparable(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    @Override
    public int compareTo(ImplementingComparable comparestu) {
        int compareage = ((ImplementingComparable)comparestu.getStudentage());
        // for ascending
        return this.studentage-compareage;

        // for descending
        // return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name= " + studentname + ", age= " + studentage+ "]";
    }
}
