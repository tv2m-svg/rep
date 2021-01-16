
package task43;


public class MyThread extends Thread{
    private Resource resource;
    
    public MyThread(String name, Resource resource){
        super (name);
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0; i<5; ++i){
            resource.writing(getName(), i);
        }
    }
    
    
}
