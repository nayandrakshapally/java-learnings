public class Encapsulation {
    public static void main(String[] args) {
        Test obj = new Test("nayan");
        // Test obj = new Test();
        // System.out.println(obj.address);
        System.out.println(obj.getName());
    }
}

class Test {
    private String name = ""; // private variable cannot be acessible outside it's own class. Setters & getters should be created

    public Test() { // default constructor
        this.name = "testing";
    }

    public Test(String value) {// parameterized constructor
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String address = "creek";
}