public class Poly {
    public static void main(String[] args) {
        // one obj = new one();
        two obj2 = new two();

        //Method overiding (type run time - polymorphism)
        obj2.add();
        // Method overloading (type compile time - polymorphism)
        //obj.sub();
        obj2.sub(1);
    }
}

class one {
    public void add(){
        System.out.println("add in one");
    }
    public void sub(){
        System.out.println("sub in one");
    }
}
class two extends one {
@Override
public void add(){
        System.out.println("add in two");
    }
    public void sub(int n1){
        System.out.println("sub in two");
    }
}