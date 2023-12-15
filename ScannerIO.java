import java.util.Scanner;

public class ScannerIO {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("enter word:");
        Scanner scan2 = new Scanner(System.in);
        String word = scan2.nextLine();

        System.out.println(num + word);
        scan.close();
        scan2.close();
    }
}
