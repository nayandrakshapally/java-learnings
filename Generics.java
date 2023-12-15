import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("nayan");
        list.add("test");
        String name = list.get(1);
        System.out.println(name);

        Student<Integer> num = new Student<>();
        Student<String> str = new Student<>();
        num.add(1);
        str.add("test");
        System.out.println(num.get() + " " + str.get());

    }
}

// generic class
class Student<T> {
    public T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
