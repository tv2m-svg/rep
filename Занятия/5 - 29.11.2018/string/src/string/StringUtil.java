
package string;

import java.util.Arrays;


public class StringUtil {
    
    public static void print (String[] str){
        System.out.println();
        for (String arg : str) {
            System.out.println(arg);
        }
         System.out.println();
    }
        
    public static double findAverageLength(String[] words){
        double sred;
        double sum=0;
        for(int i=0;i<words.length;i++){
            sum+=words[i].length();
        }
        sred=sum/words.length;
        return sred;
    }
    
    public static String findMinWords (String[] words){
        String min = words[0];        
        for(int i=1;i<words.length;i++){
            if(words[i].length()<min.length()) 
                min=words[i];                            
        }
        return min;
    }
    
    public static String findMaxWords (String[] words){
        String max = words[0];        
        for(int i=1;i<words.length;i++){
            if(words[i].length()>max.length()) 
                max=words[i];                            
        }
        return max;
    }
    
    public static void sortWords (String[] words){
        Arrays.sort(words);
    }
    
    public static String replaceLetters (String str){
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (('a' <= str.charAt(i)) && (str.charAt(i) <= 'z')) {
                out = out + (c - 'a' + 1) + '.';
            } else {
                out = out + c + '.';
            }
        }
        return out;
    }
    
    public static int countWords (String str){
        int count = 0;
        char prev = ' ';
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if ((prev == ' ') && (current != ' ')) {
                ++count;
            }
            prev = current;
        }
        return count;
    }
    
    public static String getInitials(String str){
        String myInitials = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                myInitials = myInitials + str.charAt(i);
            }
        }
        return str;
    }
    
    public static boolean isFind(String[]strs,String val){
        for(String str:strs){
            if (str.equals(val))
                return true;
        }
        return false;
    }
    
    public static boolean isFind1(String[]strs,String val){
        for(String str:strs){
            if (str.compareTo(val)==0)
                return true;
        }
        return false;
    }
    
    public static boolean isSortLetters (String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return s.equals(new String(chars));
    }
        


}
