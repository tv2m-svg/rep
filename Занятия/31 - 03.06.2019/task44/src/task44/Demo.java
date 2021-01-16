
package task44;

import java.io.IOException;

class UnresponsiveUI{
    private double d=1;

    public UnresponsiveUI() throws IOException {
        while(d>0){
            d = d + (Math.PI + Math.E)/d;
        }
        System.in.read();
    }    
}

class ResponsiveUI extends Thread{
    private double d=1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while(true){
            d = d + (Math.PI + Math.E)/d; 
        }
    }
    
    

        
}

public class Demo {

    
    public static void main(String[] args) throws IOException {
        //new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println("Main !!!");
    }
    
}
