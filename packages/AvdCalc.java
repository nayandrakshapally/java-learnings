package packages;

public class AvdCalc extends Calc {
    String names = "Nayan"; // We cannot access outside package
    public String name = ""; // If public we can access from anywhere

    public int mul(int n1, int n2) {
        return n1 * n2;
    }
}
