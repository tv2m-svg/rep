package task63;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    
    public static void readFromScanner(Scanner scan, List<Subject> list){
        int n;
        n = scan.nextInt();
        for (int i =0; i<n;i++){
            list.add(new Subject(scan.next(), scan.nextInt()));
        }
    }
    
    public static List<Subject> createSorted(List<Subject> list){
        List<Subject> tmp = new ArrayList<>(list);
        tmp.sort(null);
        return tmp;
    }

    public static void main(String[] args) {
        Subject s1 = new Subject("MA",120);
        Subject s2 = new Subject();
        Subject s3 = new Subject("MA",120);
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        
        System.out.println("s1==s3 " + s1.equals(s3));
        
        ArrayList<Subject> list = new ArrayList<>();
//        System.out.println("list=" + list);
//        readFromScanner(new Scanner(System.in), list);
//        System.out.println("list=" + list);
//        readFromScanner(new Scanner("2 C++ 200 Java 210"), list);
//        System.out.println("list=" + list);
//        try{
//        readFromScanner(new Scanner(new File("imput.txt")), list);
//        } catch(FileNotFoundException ex){
//            System.out.println("ex=" + ex);
//        }
//        
//        System.out.println("sorted list=" + createSorted(list));
//        System.out.println("list=" + list);

        int choice = 0;
        Scanner scan = new Scanner(System.in);
        while (choice!=4){
            System.out.println("1 - from File");
            System.out.println("2 - print");
            System.out.println("3 - print sorted");
            System.out.println("4 - exit");
            System.out.print("Enter choice = ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    try {
                        readFromScanner(new Scanner(new File("imput.txt")), list);
                    } catch (FileNotFoundException ex) {
                        System.out.println("ex=" + ex);
                    }
                    break;
                case 2:
                    System.out.println("list=" + list);
                    break;
                case 3:
                    System.out.println("sorted list=" + createSorted(list));
                    break;
                default:
                    choice = 4;
            }
        }
    }

}
