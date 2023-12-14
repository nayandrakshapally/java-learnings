public class Hello {
    // Static variable declaration
    static String name = "Nayan";
    static int age;
    // Normal variable declaration
    String address = "28269";

    // Static block is called once on class load, this can print without main method
    static {
        age = 28;
    }

    public static void main(String[] args) {
        // we can directly access the instance variable if static
        System.out.println(name);
        System.out.println(age);
        // We can overide the variable local
        name = "test!";
        System.out.println(name);

        // We cannot directly access instance variable, we need to create object
        Hello obj = new Hello();
        System.out.println(obj.address);
        // We can overide the variable local
        obj.address = "creek";
        System.out.println(obj.address);

        // we can directly call static method with method name if it is static method
        staticMethod();

        // we can access other class variables
        Variables obj2 = new Variables();
        // can be overiden
        // obj2.status = "offline";
        System.out.println(obj2.status);
    }

    static void staticMethod() {
        System.out.println("static method " + name);
    }
}

class Variables {
    int rollno = 44;
    char initial = 'D';
    String status = "online";
}