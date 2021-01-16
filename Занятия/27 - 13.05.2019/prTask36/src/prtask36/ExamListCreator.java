
package prtask36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExamListCreator {
    public void FillFromTextFile(ExamList examList, String fileName) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNextInt()){
            examList.add(new Exam(scan.nextInt(), scan.next(), scan.nextInt()));
        }
    }
}
