import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class CollectingDataSet {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        // adding students
        studentList.add(new Student(11, "Jon", 23));
        studentList.add(new Student(12, "Paul", 24));
        studentList.add(new Student(13, "Ajeet", 26));
        studentList.add(new Student(14, "Steve", 27));
        studentList.add(new Student(15, "John", 29));

        // fetching student data as a set
        Set<Student> students = studentList.stream()
            .filter(n -> n.id > 13)
            .collect(Collectors.toSet());

        // iterating set
        for(Student stu: students) {
            System.out.println(stu.id + " " + stu.name + " " + stu.age);
        }
    }
}
