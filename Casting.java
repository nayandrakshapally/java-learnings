public class Casting {
    public static void main(String[] args) {
        //upcasting
        A obj = new B(); //parent reference and child object
        obj.show1();

        //downcasting
        B obj1 = (B) obj; // comback to child reference
        obj1.show2();
    }
}

class A {
    public void show1(){
        System.out.println("Now showing one");
    }
}

class B extends A {
    public void show2(){
        System.out.println("Now showing two");
    }
}
