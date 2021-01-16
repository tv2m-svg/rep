
package prtask24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        ExamList exams = new ExamList();
        System.out.println("exams = " + exams);
        
        Scanner scan = new Scanner(new File("studs.txt"));
        while(scan.hasNextInt()){
            exams.add(new Exam(scan.nextInt(),scan.next(),scan.nextInt()));
        }
        System.out.println("exams = " + exams);
        
        exams.printUp();
        exams.printDown();
               
    
        //Вывести алфавитный список всех названий предметов
        Set<String> set = exams.calculateSubjects();
        System.out.println("set = " + set);
    
        
        Exam key = new Exam(111,"eng",9);
        System.out.println("contains = " + exams.contains(key));
        System.out.println("indexOf = " + exams.indexOf(key));
        
        List<Exam> list111 = exams.findAll1(111);
        System.out.println("list111 = " + list111);
        if(!list111.isEmpty()){
           
        }
        
        List<Exam> list2111 = exams.findAll2(new PredicateNumber(111));
        System.out.println("list2111 = " + list2111);
        
        List<Exam> listMA = exams.findAll2(new PredicateSubject("MA"));
        System.out.println("list2111 = " + listMA);
        
        List<Exam> listOtl = exams.findAll2(new Predicate(9,10));
        System.out.println("listOtl = " + listOtl);
        
        Map<String, Double> map = exams.calculateAverage();
        System.out.println("map = " + map);
        
        try {
            exams.serialize("exams.bin");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
