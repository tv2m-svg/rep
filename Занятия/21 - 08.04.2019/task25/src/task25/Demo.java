
package task25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner (new File("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        while(scan.hasNextLine()){
            pw.println(scan.nextLine().replaceAll("\\bpublic\\b", "private"));
        }
        pw.close();
    }
    
}
