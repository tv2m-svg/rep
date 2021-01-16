package task.pkg61;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> list = new ArrayList<>();
    
    // Добавление новой книги
    public void addBook(Book book){
        list.add(book);        
    }
    
    //Вывод представление всех книг на экран в алфавитном 
    //порядке автора и названия
    public void print(){
        list.sort(null);
        StringBuffer sb = new StringBuffer();
        for(Book book:list)
            sb.append(book)
                    .append('\n');
        System.out.println(sb);
    }
}
