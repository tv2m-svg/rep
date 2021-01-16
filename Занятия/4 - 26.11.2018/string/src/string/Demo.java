
package string;

import java.util.Arrays;


public class Demo {

    
    public static void main(String[] args) {
        System.out.println("Args!!!");
         StringUtil.print(args);
        
        double sred;
        double sum=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i].length();
        }
        sred=sum/args.length;
        System.out.println("sredn col simv = " + sred);
        
        String min = args[0];        
        for(int i=1;i<args.length;i++){
            if(args[i].length()<min.length()) 
                min=args[i];                            
        }
        System.out.println("samoe korotkoe = " + min);
        System.out.println("colichestvo simv = " + min.length());
        
        Arrays.sort(args);
        System.out.println();
        System.out.println("posle sortirovki");
        StringUtil.print(args);
        
        //task 43
        
        String str = "Hello!!! World !!! game";
        str = str.replace('o', 'a');
        System.out.println("str= " + str);
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        
        //task 44
        
        String out = "";
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(('a'<=str.charAt(i))&&(str.charAt(i)<='z')){
                out = out +  (c-'a'+1)+'.';
            }
            else {
                out=out+c+'.';
            }
        }
        
        System.out.println(str);
        System.out.println(out);
        
        //task 45
        
        str = "  mama papa 123  ";
        int count = 0;
        char prev = ' ';
        for (int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if ((prev ==' ')&&(current!=' ')){
                ++count;
            }
            prev = current;
        }
        System.out.println("count = " + count);
        
    }
    
}
