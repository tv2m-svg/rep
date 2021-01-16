
package prbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Demo {

    
    public static void main(String[] args) {
        Book book = new Book(123,"Alisa","Kerrol","Mir",2009);
        System.out.println("Book = " + book);
        
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = new Book(47,"War&Peace","Tostoy","Forign Lit",1995);
        books[2] = new Book(71,"Java","Ekkel","Piter",2011);
        books[3] = new Book(71,"c++","Ekkel","Piter",2012);
        books[0].setYear(2019);
        System.out.println("Book = " + book);
        System.out.println("Book[0] = " + books[0]);
        
        System.out.println("books= " + Arrays.toString(books));
        Util.printAll(books);
        
        ArrayList<Book> list1 = BooksUtil.searchByYear(books, 1000);
        System.out.println("list1=" + list1);
        
        Util.printAll(list1.toArray());
        
        Book bb = new Book(71,null,null,null,0);
        System.out.println("count= " + Collections.frequency(list1, bb));
        
        System.out.println("min= " + Collections.min(list1));
        
        Arrays.sort(books);
        System.out.println("posle sortirovki= ");
        Util.printAll(books);
        
    }
    
}
