import java.util.stream.Collectors;
import java.util.List;
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

class GettingAverageAgeStudentsUsingAveragingIntMethod {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        // adding students
        studentList.add(new Student(11, "Jon", 23));
        studentList.add(new Student(12, "Paul", 24));
        studentList.add(new Student(13, "Ajeet", 26));
        studentList.add(new Student(14, "Steve", 27));
        studentList.add(new Student(15, "John", 29));

        // getting the average age
        Double avgAge = studentList.stream()
            .collect(Collectors.averagingInt(s -> s.age));

        System.out.println("Average Age of Students is: " + avgAge);
    }
}
