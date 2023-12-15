package questionaries;

// create a java pgm that functions as a basic calc. It should take two numbers and perform operations like add, sub & mul based on user i/p
public class FirstQues {
    public static void main(String[] args) {
        FirstQues obj = new FirstQues();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.sub(1, 2));
        System.out.println(obj.mul(1, 2));

    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public int mul(int n1, int n2) {
        return n1 * n2;
    }
}
