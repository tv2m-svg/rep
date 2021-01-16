package task66;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Student stud = new Student("Ivan", "BGUIR", 7.9, 2);
        System.out.println("stud = " + stud);
        
        Pupil pupil = new Pupil("Petr","School # 12",8.2,5, Behavior.GOOD);
        System.out.println("pupil = " + pupil);
        
        LearnerList<Student> studs = new LearnerList<>();
        Scanner scan;
        try {
            scan = new Scanner (new File("input1.txt"));
            while (scan.hasNext()){
                studs.add(new Student(scan.next(),scan.next(),scan.nextDouble(),scan.nextInt()));
            }
            studs.print();//task 1
            System.out.println("count = " + studs.count(stud));//task 2
            System.out.println("find = " + studs.find(stud));//task 3
            System.out.println("min = " + studs.min());//task 4
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(LearnerList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
