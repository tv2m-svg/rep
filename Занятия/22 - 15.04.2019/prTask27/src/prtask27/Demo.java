
package prtask27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("in.txt"));
        Pattern pattern = Pattern.compile("\\b([A-Z][a-zA-Z]*)\\s\\1\\b");
        String str;
        Matcher matcher;
        while(scanner.hasNextLine()){
            str = scanner.nextLine();
            matcher = pattern.matcher(str);
            if (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
    
}
