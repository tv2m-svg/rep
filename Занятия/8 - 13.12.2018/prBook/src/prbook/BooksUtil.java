
package prbook;

import java.util.ArrayList;


public class BooksUtil {
    
    // список книг заданного автора
    public static ArrayList<Book> searchByAuthor(Book[] b,String a){
        ArrayList<Book> al = new ArrayList<Book>();
        for (Book book : b){
            if (book.getAuthor().equals(a)) {
                al.add(book);
            }
        }
        return al;
    }
    
    public static ArrayList<Book> searchByYear(Book[] b, int year) {
        ArrayList<Book> al = new ArrayList<Book>();
        for (Book book : b) {
            if (book.getYear() > year) {
                al.add(book);
            }
        }
        return al;
    }
}
