package string;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Args!!!");
        StringUtil.print(args);

        //task 40                
        System.out.println("sredn col simv = " + StringUtil.findAverageLength(args));

        //task 41                
        System.out.println("samoe korotkoe = " + StringUtil.findMinWords(args));
        System.out.println("colichestvo simv = " + StringUtil.findMinWords(args).length());

        //task 42
        StringUtil.sortWords(args);
        System.out.println();
        System.out.println("posle sortirovki");
        StringUtil.print(args);

        //task 43        
        String str = "Hello!!! World !!! game";
        str = str.replace('o', 'a');
        System.out.println("str= " + str);
        System.out.println();

        //task 44                
        System.out.println(str);
        System.out.println(StringUtil.replaceLetters(str));
        System.out.println();

        //task 45
        str = "  mama papa 123  ";
        System.out.println(str);
        System.out.println("count = " + StringUtil.countWords(str));
        System.out.println();

        //task 47
        String myName = "Fred F. Flintstone";        
        System.out.println("My initials are: " + StringUtil.getInitials(str));
        
        //task 48
        System.out.println();
        String[] strs = {"by","and","but"};
        System.out.println("isFind = " + StringUtil.isFind1(strs, "but"));
        System.out.println("isFind = " + StringUtil.isFind1(strs, "And"));
        
        //task49
        System.out.println();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter str: ");
        //str = scanner.nextLine();
        System.out.println("str = (" + str + ")");
        String[] words = str.split("[ ]+");
        for(String word : words){
            System.out.println(word);
        }
        
        //task 50
        /*System.out.println();
        String[] strs5 = new String[5];
        for(int i=0;i<strs5.length;++i){
            System.out.print("strs5[" + i + "]=");
            strs5[i]= scanner.nextLine();
        }
        System.out.println("strs5= " + Arrays.toString(strs5));
        int maxLen = StringUtil.findMaxWords(strs5).length();
        System.out.println("Longest strings:");
        for(String str5 : strs5){
            if(str5.length()==maxLen)
                System.out.println(str5);
        }
        */
        //task 51
        System.out.println(StringUtil.isSortLetters("absz"));

    }

}
