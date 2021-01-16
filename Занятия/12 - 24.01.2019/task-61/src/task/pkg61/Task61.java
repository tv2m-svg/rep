package task.pkg61;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

public class Task61 {

    public static void main(String[] args) throws FileNotFoundException {
        Book book1 = new Book(1,"Tolstoy","War&Peace");
        Book book2 = new Book();
        
        System.out.println("Book1 = " + book1);
        System.out.println("Book2 = " + book2);
        
        book2.setId(7);
        System.out.println("Book2 = " + book2);
        
        Library library = new Library();        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(new Book(3,"Tolstoy","Anna"));
        System.out.println("library = " + library);
        
        library.print();
        
        library.deleteBook(17);
        System.out.println("library = " + library);
        
        List<Book> lb = library.choiceBookByAuthor("Tolstoy");
        System.out.println("list by Tolstoy = " +  lb);
        
        Set<String> titles = library.choiceTitleByAuthor("Tolstoy");
        System.out.println("list by Tolstoy = " +  titles);
        
        //library.writeToTextFile("1.txt");
        library.readFromTextFile("1.txt");
        library.print();
    }

}
