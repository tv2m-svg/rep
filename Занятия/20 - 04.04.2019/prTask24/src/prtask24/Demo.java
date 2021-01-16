
package prtask24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException {
        //Ввести сведения из файла в подходящий коньейнер
        List<Exam> exams = new ArrayList<>();
        Scanner scan = new Scanner(new File("studs.txt"));
        while(scan.hasNextInt()){
            exams.add(new Exam(scan.nextInt(),scan.next(),scan.nextInt()));
        }
        System.out.println("exams = " + exams);
        
        //Вывести на консоль сведения по возрастанию
        exams.sort(null);
        System.out.println("exams = " + exams);
        //убыванию номеров зачёток
        exams.sort(new Comparator<Exam>(){
            @Override
            public int compare(Exam o1, Exam o2) {
                return -(o1.compareTo(o2));
            }
            
        });
        System.out.println("exams = " + exams);
        
        //Вывести алфавитный список всех названий предметов
        Set<String> set = new TreeSet<>();
        for (Exam exam : exams){
            set.add(exam.getSubject());            
        }
        System.out.println("set = " + set);
        
        //Вычислить средний балл по каждому предмету
        
    }
    
}
