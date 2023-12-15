public class Enum {
    public static void main(String[] args) {
        Status obj = Status.Pending;
        System.out.println(obj.ordinal()); // ordinal property will display the index 0

        Status[] items = Status.values();
        for(Status word: items){
            System.out.println(word);
        }
    }
}

enum Status {
    Pending, Completed, Failed
}

enum Laptop {
    macbook(1500), dell(1000);
    public int price;
    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
}