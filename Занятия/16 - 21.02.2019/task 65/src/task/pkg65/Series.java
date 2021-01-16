
package task.pkg65;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


abstract public class Series {
    
    private int a, b;

    public Series(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    
    
    // вычисление j-го элемениа прогрессии (абстрактный)
    abstract public int calcElem(int j);
    
    // вычисление суммы прогрессии (не абстрактный)
    public int calcSum(int count){
        int sum = 0;
        for (int i=1; i<=count; ++i){
            sum += calcElem(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{a=" + a + ", b=" + b + '}';
    }
    
    // сохранение прогрессии в файл (не абстрактный)
    public void saveToTxtFile(String fileName, int count) 
            throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(fileName);
        for (int i=1; i<=count; ++i){
            pw.print(calcElem(i));
            pw.print('\t');
        }
        pw.close();
    }
    
}
