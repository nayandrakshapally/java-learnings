import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodAndConstref {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("one", "two");

        //method reference
        List<String> unames = names.stream().map(String::toUpperCase).toList();
        System.out.println(unames);

        List<Student> students = new ArrayList<>();
        students = names.stream().map(name -> new Student(name, 1)).collect(Collectors.toList());
        students.forEach(n -> System.out.println(n.getName() + "-" + n.getAge()));
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}