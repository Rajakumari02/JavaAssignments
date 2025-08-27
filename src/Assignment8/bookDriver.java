package Assignment8;

import java.util.ArrayList;
import java.util.*;
public class bookDriver {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"Ford","RK",100.00));
        books.add(new Book(2,"Business","Rajakumari",200.00));
        books.add(new Book(3,"Solutions","Renga",300.00));
        books.add(new Book(4,"Ford Business","Raj",400.00));
        books.add(new Book(5,"GTT","Ok",400.00));
        System.out.println("Book List:");
        for(Book book:books){
            System.out.println(book);
        }
        Collections.sort(books);
        System.out.println("Sorted Book List by title:");
        for(Book book:books){
            System.out.println(book);
        }
        Collections.sort(books,new Pricecomparator());
        System.out.println("Sorted Book List by price:");
        for(Book book:books){
            System.out.println(book);
        }
        Collections.sort(books,new AuthorComparator());
        System.out.println("Sorted Book List by author:");
        for(Book book:books){
            System.out.println(book);
        }

    }
}
