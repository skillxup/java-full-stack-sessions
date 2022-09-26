class Teacher {
    // declaring the fields at main / parent Class
    String designation = "Teacher";
    String college = "St. Xvis";

    // defining the methods in main / parent Class
    void does() {
        System.out.println("Teaching");
    }
}

public class MathTeacher extends Teacher {
    // declaring the fields at child / sub Class
    String mainSubject = "Maths";

    public static void main(String[] args) {
        MathTeacher obj = new MathTeacher();

        // accessing the obj of MathTeacher
        System.out.println("obj : " + obj.mainSubject);

        // accessing the state (fields) of a main / parent Class (Teacher) Class into child / sub Class (MathTeacher)
        System.out.println("Designation: " + obj.designation);
        System.out.println("College: " + obj.college);

        // accessing the definition of main / parent Class
        obj.does();
    }
}
