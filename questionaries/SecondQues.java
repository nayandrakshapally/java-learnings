package questionaries;

//create a class name car with attributes like make, model & year. Implement methods set and dispaly these attributes for different car objects
public class SecondQues {
    public static void main(String[] args) {
        Car obj = new Car("new car", "suv", 2024);
        Car obj2 = new Car("used car", "sedan", 2024);
        obj.drive();
        obj2.drive();
    }
}

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println(this.make + "," + this.model + "," + this.year);
    }
}
