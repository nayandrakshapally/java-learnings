public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.config();

        // if inner class is static
        // A.B obj2 = new A.B();
        // obj2.config();
    }
}
// If a class is dependent for one class and not required for others, we can
// create inner

class A {
    int age = 20;

    public void show() {
        System.out.println("showing in class A");
    }

    class B {
        A obj = new A();

        public void config() {
            System.out.println("config called in B" + obj.age);
        }
    }
    // static class B {
    // public void config(){

    // }
    // }
}
