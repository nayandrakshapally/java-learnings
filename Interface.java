public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        //we can use lamda expression only on function interface
        C obj2 = (i,j)->i+j;
        obj2.add(1, 2);
    }
}

// Instead of abstract class we can use interface. It is not a class, By defualt
// everymethod in interface is public abstract.
interface A {
    int age = 20; // all variables inside interface are final & static by defualt

    void show();// is same as public abstract

    void config();
}

class B implements A {
    public void show() {
    };

    public void config() {
    };
}

@FunctionalInterface
// Which has only one method inside an interface
interface C {
    int add(int i, int j);
}