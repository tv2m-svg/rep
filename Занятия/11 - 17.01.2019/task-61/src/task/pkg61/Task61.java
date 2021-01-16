package task.pkg61;

public class Task61 {

    public static void main(String[] args) {
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
        //System.out.println("library = " + library);
        library.print();
        
    }

}
