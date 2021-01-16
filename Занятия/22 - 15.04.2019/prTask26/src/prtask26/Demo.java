
package prtask26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo {

    
    public static void main(String[] args) {
        try {
            if(args.length<2){
                System.out.println("Arguments!!! < 2");
                System.exit(1);
            }
            Scanner scanner = new Scanner(new File(args[0]));
            PrintWriter pw = new PrintWriter(new File(args[1]));
            String str = "";
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                str = str.replaceAll("\\bpublic\\b", "private");
                //delete comments
                str.replaceAll("//.*$", "");
                
                if (str.indexOf("/*")>=0 && str.indexOf("*/")>=0)
                str.replaceAll("/[*].*[*]/", "");
                pw.println(str);
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.err.println("exception: " + ex);
        }
    }
    
}
