
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaApplication3 {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("text.txt"));
        scan.useDelimiter("[ ;,+()]+");
        String str;
        while(scan.hasNext()){
            str = scan.next();
            System.out.printf("%s%n",str);
        }
    }
    
}
