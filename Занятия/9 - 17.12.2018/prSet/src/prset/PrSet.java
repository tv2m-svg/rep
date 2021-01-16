
package prset;

import java.util.Scanner;

public class PrSet {
    public static void main(String[] args) {
        SetOfChars set1 = new SetOfChars();
        System.out.println("set = " + set1);
        
        set1.add('a');
        set1.add('b');
        set1.add('c');
        set1.add('a');
        System.out.println("set1 = " + set1);
       
        SetOfChars set2 = new SetOfChars();
        set2.add('a');
        set2.add('1');
        set2.add('2');
        set2.add('b');
        System.out.println("set2 = " + set2);    
        
        System.out.println("intersection = " + set1.intersection(set2));
        System.out.println("union = " + set1.union(set2));
        
        //Определить количество различных букв в слове
        //Version 1
        String word2 = "Hello";
        SetOfChars difChars2 = new SetOfChars();
        for (int i=0; i<word2.length();++i){
            difChars2.add(word2.charAt(i));
        }
        System.out.println("difChars = " + difChars2);
        System.out.println("количество различных букв = " + difChars2.size());
        
        //Ввести строку
        String str = new String();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = scan.nextLine();
        scan.close();
        System.out.println("str=" + str);
        
        //Найти слово с максимальным количеством глаcных букв
        SetOfChars vowelset = new SetOfChars("aeoiuy");
        String[] words = str.split(" ");
        int indexMax = -1;
        int countVowelMax = -1;
        for(int i=0; i<words.length;i++){
            SetOfChars tmp = new SetOfChars(words[i]);
            SetOfChars intersection = tmp.intersection(vowelset);
            int count = intersection.size();
            if (countVowelMax<count){
                countVowelMax = count;
                indexMax = i;
            }            
        }
        System.out.println("max word=" + words[indexMax]);
        
        
    }
}
