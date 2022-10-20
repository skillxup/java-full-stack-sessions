import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

class Student {
    int stuId;
    int stuAge;
    String stuName;

    Student(int id, int age, String name) {
        this.stuId = id;
        this.stuAge = age;
        this.stuName = name;
    }

    public int getStuId() {
        return stuId;
    }

    public int getStuAge() {
        return stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public static List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 28, "lucy"));
        list.add(new Student(2, 41, "ajeet"));
        list.add(new Student(3, 27, "steve"));
        list.add(new Student(4, 64, "daniel"));
        list.add(new Student(5, 25, "tim"));
        return list;
    }
}

class AllMatchPredicateExample {
    public static void main(String[] args) {
        Predicate<Student> p1 = s -> s.stuName.startsWith("a");
        Predicate<Student> p2 = s -> s.stuAge < 40;
        Predicate<Student> p3 = s -> s.stuAge < 40 && s.stuName.startsWith("p");

        List<Student> list = Student.getStudents();
        
        boolean b1 = list.stream().allMatch(p1);
        System.out.println("list.stream().allMatch(p1): " + b1);

        boolean b2 = list.stream().allMatch(p2);
        System.out.println("list.stream().allMatch(p2): " + b2);

        boolean b3 = list.stream().allMatch(p3);
        System.out.println("list.stream().allMatch(p3): " + b3);
    }
}
