import java.util.Arrays;

public class Arrayst {
    public static void main(String[] args) {
        // To define array size and declare array
        int array[] = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // other way
        int arraytwo[] = { 4, 1, 2, 3 };
        Arrays.sort(arraytwo);
        for (int n : arraytwo) {
            System.out.println(n);
        }

        // Multi dimensional array
        int multiarray[][] = new int[2][3];
        for (int arr[] : multiarray) {
            System.out.println();
            for (int n : arr) {
                n = (int) (Math.random() * 10);
                System.out.print(n + " ");
            }
        }

        // Jagged array
        // if we are not sure about size of an array, individually we can define size of
        // each array
        int num[][] = new int[2][];
        num[0] = new int[1];
        num[1] = new int[2];

    }
}
