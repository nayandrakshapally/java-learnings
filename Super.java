public class Super {
    public static void main(String[] args) {
        B obj = new B(10);
        obj.show();
    }
}

class A {
    public A() {
        System.out.println("constructor A is called");
    }
    public void show() {
        System.out.println("show method A is called");
    }
}

class B extends A {
    public B() {
        super(); // this will execute parent class constructor
        System.out.println("constructor B is called");
    }

    public B(int a) {
        this(); // this will execute and calls the defualt constructor of same class and that
                // will executes the parent class constructor
        System.out.println("constructor B is called with value " + a);
    }

    public void show() { // Method overide of class A
        System.out.println("show method B is called");
    }
}