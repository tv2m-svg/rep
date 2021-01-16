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
        while (scan.hasNextInt()) {
            exams.add(new Exam(scan.nextInt(), scan.next(), scan.nextInt()));
        }

        System.out.println("exams = " + exams);

        exams.printUp();
        exams.printDown();

        // алфавитный список всех названий предметов
        Set<String> set = exams.calculateSubjects();
        System.out.println("set = " + set);

        Exam key = new Exam(111, "", -5);
        System.out.println("contains = " + exams.contains(key));
        System.out.println("indexOf = "
                + exams.get(exams.indexOf(key)));

        List<Exam> list111 = exams.findAll1(111);
        System.out.println("list111 = " + list111);
        if (!list111.isEmpty()) {
            System.out.format("number = 111 average = %.2f\n",
                    ExamList.calculateAverageByList(list111));
        }

        List<Exam> list2111 = exams.findAll2(new PredicateNumber(111));
        System.out.println("list2111 = " + list2111);

        List<Exam> listMA = exams.findAll2(new PredicateSubject("MA"));
        System.out.println("listMA = " + listMA);

        Map<String, Double> map = exams.calculateAverageBySubject();
        System.out.println("map = " + map);

        System.out.format("ALL average = %.2f\n",
                ExamList.calculateAverageByList(exams));

        System.out.format("number 333 average = %.2f\n",
                ExamList.calculateAverageByList(exams.findAll1(333)));

        Serializator sz = new Serializator();
        try {
            sz.simpleSerialization(exams, "apr18.bin");
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Exams = " + exams);
        
        try {
            ExamList newList = sz.simpleDeserialization("apr18.bin");
            System.out.println("newList = " + newList);
            
            exams.clear();
            System.out.println("Exams = " + exams);
            exams = sz.simpleDeserialization("apr18.bin");
            System.out.println("Exams = " + exams);
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean isSerialize = sz.serialization(exams, "apr18_excellent.txt");
        System.out.println("isSerialize = " + isSerialize);
                    

    }

}
