public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new Car() {
            public void drive() { // defining
                System.out.println("driving the car");
            }
        };
        obj.drive();
        obj.playmusic();
    }
}

abstract class Car {
    public abstract void drive(); // declaration

    public void playmusic() {
        System.out.println("playing music");
    }
}

// General way to define if not anonymous

// class Test extends Car {
//     public void drive() { // defining
//         System.out.println("driving the car");
//     }
// }
