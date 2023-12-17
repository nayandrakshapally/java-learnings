package questionaries;

import java.util.ArrayList;
import java.util.List;

//Build a java application to handle library operations. include functions like adding books, checking out books, returning books, and displaying available books.

public class SixQues {
    List<String> books = new ArrayList<>();
    List<String> cart = new ArrayList<>();

    public static void main(String[] args) {
        try {
            SixQues obj = new SixQues();
            obj.addBooks("bookone");
            obj.addBooks("booktwo");
            obj.addBooks("bookthree");
            obj.addBooks("bookFour");
            System.out.println(obj.availableBooks());
            obj.checkOutBooks("booktwo");
            obj.checkOutBooks("bookone");
            System.out.println(obj.availableBooks());
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
    }

    public List<String> availableBooks() {
        return books;
    }

    public void addBooks(String value) {
        books.add(value);
    }

    public List<String> checkOutBooks(String value) {
        if (books.contains(value)) {
            cart.add(value);
            books.remove(value);
            System.out.println(cart);
        } else {
            System.out.println("Item not found!");
        }
        return cart;
    }
}