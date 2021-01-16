package task43;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {

    public static void main(String[] args) {
        Resource resource = null;
        try {
            resource = new Resource("out.txt");
            MyThread t1 = new MyThread("first", resource);
            MyThread t2 = new MyThread("second", resource);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (FileNotFoundException ex) {
            System.out.println("File error" + ex);
        }catch (InterruptedException ex){
            System.out.println("Thread error" + ex);
        }finally{
            resource.close();
        }
    }

}
