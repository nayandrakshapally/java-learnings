package questionaries;

// Palindrome - if given string is palindrome or not
public class FourQues {
    public static void main(String[] args) {
        String name = "Nayan";
        String reverse = new StringBuilder(name).reverse().toString();
        if (name.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
