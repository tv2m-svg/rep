
package demo;


public class FractionUtils {
    
    public static boolean isFind (Fraction[] arr, Fraction key){
        for(int i=0; i< arr.length;i++){
            if (arr[i].equals(key))
                return true;
        }
        return false;
    }
    
    public static Fraction min(Fraction[] arrFr){
        Fraction mi = arrFr[0];
        for(Fraction elem: arrFr){
            if(mi.compareTo(elem)>0){
                mi = elem;
            }
        }
        return mi;
    }
}
