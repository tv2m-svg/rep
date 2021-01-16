
package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Demo {

   
    public static void main(String[] args) throws FileNotFoundException {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(1,3 );
                
        System.out.printf("f1={%d/%d}%n",f1.getA(),f1.getB());
        // f1.setB(5);
        System.out.printf("f1={%d/%d}%n",f1.getA(),f1.getB());
        System.out.println("f1=" + f1.toString());
        System.out.println("f2=" + f2);
        
        Fraction sum =  f1.add(f2);
        System.out.println("sum=" + sum);
        
        Fraction product =  f1.multiply(f2);
        System.out.println("product=" + product);
        System.out.printf("%s * %s = %s%n",f1,f2,product);
        
        Scanner scan = new Scanner(new File("fractions.txt"));
        int n;
        Fraction[] arr;
        n = scan.nextInt();
        arr = new Fraction[n];
        for (int i=0; i < n ;++i){
            arr[i]=new Fraction(scan.nextInt(),scan.nextInt());
        }
        System.out.println("arr=" + Arrays.toString(arr));
        Fraction key = new Fraction (1,2);
        System.out.println("isFind= "+ FractionUtils.isFind(arr, key));
        int count = Collections.frequency(Arrays.asList(arr), key);
        System.out.println("count= " + count);
        
        List <Fraction> list = Arrays.asList(arr);
        System.out.println("max= " + Collections.min(list));
        
        System.out.println("min= " + FractionUtils.min(arr));
        
    }
    
}
