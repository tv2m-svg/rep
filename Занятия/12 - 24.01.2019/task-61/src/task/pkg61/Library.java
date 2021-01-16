package task.pkg61;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Library {

    private List<Book> list = new ArrayList<>();

    // Добавление новой книги
    public void addBook(Book book) {
        list.add(book);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Library{\n");
        for (Book book : list) {
            sb.append('\t')
                    .append(book)
                    .append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    //Вывод представление всех книг на экран в алфавитном 
    //порядке автора и названия
    public void print() {
        /*List<Book> copy = new ArrayList<>(list);
        list.sort(null);
        System.out.println(this.toString());
        list = copy;*/

        Library lib = new Library();
        lib.list.addAll(list);
        lib.list.sort(null);
        System.out.println(lib.toString());
    }
    
    //Удаление книги по идентификациооному номеру
    public void deleteBook(int id){
        /*Book findBook = null; //findBook = null
        for(Book book:list){
            if (book.getId()==id){
                findBook = book;
                break;
            }
        }
        list.remove(findBook);*/
        
        int index; 
        for(index=0;index<list.size();++index){
            
            if (list.get(index).getId()==id){
                break;
            }
        }
        if (index<list.size())
        list.remove(index);
    }
    
    //Выбор книг по заданному полю "Автор"
    //Упорядочить по алфавиту
    public List<Book> choiceBookByAuthor(String author){
        List<Book> listByAuthor = new ArrayList<>();
        for(Book book : list){
            if(book.getAuthor().equals(author)){
                listByAuthor.add(book);
            }
        }
        listByAuthor.sort(null);
        return listByAuthor;
    }
    
    //Выбор названий книг по заданному полю "Автор"
    //Упорядочить по алфавиту
    public Set<String> choiceTitleByAuthor(String author){
        Set<String> listByAuthor = new TreeSet<>();
        for(Book book : list){
            if(book.getAuthor().equals(author)){
                listByAuthor.add(book.getTitle());
            }
        }
        return listByAuthor;
    }
    
    public void writeToTextFile(String fileName) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(fileName);
        for(Book book : list){
            pw.format("%5d %20s %30s%n", book.getId(),book.getAuthor(),book.getTitle());
        }
        pw.close();
    }
    
    public void readFromTextFile (String fileName) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));
        list.clear();
        int i=0;
        while (scan.hasNext()){
            System.out.println("i=" + i);
            list.add(new Book(scan.nextInt(),scan.next(),scan.next()));
        }
    }
}
