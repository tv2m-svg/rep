
package prtask38;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {

    
    public static void main(String[] args) {
        // Ввести строки из файла, записать в список
        List<String> al = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("input.txt"));
            while(scan.hasNextLine()){
                al.add(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Вывести строки в файл, в прямом и обратном порядке
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        
        for(int i=al.size()-1; i>=0 ; --i){
            System.out.println(al.get(i));
        }
        
        ListIterator<String> listIter = al.listIterator(al.size());
        while (listIter.hasPrevious()){
            System.out.println(listIter.next());
        }
    }    
    
}
