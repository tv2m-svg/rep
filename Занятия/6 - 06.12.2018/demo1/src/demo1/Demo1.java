package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("text.txt"));
        String str;
        for ( int i=1;sc.hasNext();++i) {
            str = sc.next();
            System.out.printf("%2d).(%s)%n",  i ,str );
        }
    }

}
