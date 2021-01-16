package task43;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Resource {

    private PrintWriter file;

    public Resource(String fileName) throws FileNotFoundException {
        file = new PrintWriter(fileName);
    }

    public synchronized void writing(String str, int i) {
        try {
            file.print(str + i);
            System.out.print(str + i);
            Thread.sleep((long) (Math.random() * 10));
            file.print("->" + i + " ");
            System.out.print("->" + i + " ");
        } catch (InterruptedException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void close(){
        file.close();
    }

}
